package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final l reflectionAccessors = new l();
    private final SparseArray<m> flutterIdToOrigin = new SparseArray<>();
    private final Map<m, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i7) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i7;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l7;
        int iIntValue;
        for (int i7 = 0; i7 < accessibilityNodeInfo.getChildCount(); i7++) {
            l lVar = this.reflectionAccessors;
            Method method = lVar.f14349f;
            Long l8 = null;
            Field field = lVar.f14348e;
            Method method2 = lVar.f14347d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l7 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i7));
                    } catch (IllegalAccessException e7) {
                        Log.w(TAG, "Failed to access getChildId method.", e7);
                    } catch (InvocationTargetException e8) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e8);
                    }
                } else {
                    try {
                        l7 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i7));
                        l7.getClass();
                    } catch (ArrayIndexOutOfBoundsException e9) {
                        e = e9;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    } catch (IllegalAccessException e10) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e10);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    }
                }
                l8 = l7;
            }
            if (l8 != null) {
                int iLongValue = (int) (l8.longValue() >> 32);
                m mVar = new m(view, iLongValue);
                if (this.originToFlutterId.containsKey(mVar)) {
                    iIntValue = this.originToFlutterId.get(mVar).intValue();
                } else {
                    int i8 = this.nextFlutterId;
                    this.nextFlutterId = i8 + 1;
                    cacheVirtualIdMappings(view, iLongValue, i8);
                    iIntValue = i8;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i7, int i8) {
        m mVar = new m(view, i7);
        this.originToFlutterId.put(mVar, Integer.valueOf(i8));
        this.flutterIdToOrigin.put(i8, mVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i7, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i7);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i7);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i7 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i7 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l7;
        Parcel parcelObtain;
        long j;
        Method method = this.reflectionAccessors.f14345b;
        Long lValueOf = null;
        if (method != null) {
            try {
                l7 = (Long) method.invoke(accessibilityNodeInfo, null);
                l7.getClass();
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e7);
                if (Build.VERSION.SDK_INT < 26) {
                    Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    parcelObtain = Parcel.obtain();
                    parcelObtain.setDataPosition(0);
                    accessibilityNodeInfoObtain.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    j = parcelObtain.readLong();
                    if (l.b(0, j)) {
                        parcelObtain.readInt();
                    }
                    if (l.b(1, j)) {
                        parcelObtain.readLong();
                    }
                    if (l.b(2, j)) {
                        parcelObtain.readInt();
                    }
                    lValueOf = l.b(3, j) ? Long.valueOf(parcelObtain.readLong()) : null;
                    parcelObtain.recycle();
                }
                l7 = lValueOf;
            } catch (InvocationTargetException e8) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e8);
                if (Build.VERSION.SDK_INT < 26) {
                    Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    parcelObtain = Parcel.obtain();
                    parcelObtain.setDataPosition(0);
                    accessibilityNodeInfoObtain2.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    j = parcelObtain.readLong();
                    if (l.b(0, j)) {
                        parcelObtain.readInt();
                    }
                    if (l.b(1, j)) {
                        parcelObtain.readLong();
                    }
                    if (l.b(2, j)) {
                        parcelObtain.readInt();
                    }
                    if (l.b(3, j)) {
                    }
                    parcelObtain.recycle();
                }
                l7 = lValueOf;
            }
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain3 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                parcelObtain = Parcel.obtain();
                parcelObtain.setDataPosition(0);
                accessibilityNodeInfoObtain3.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                j = parcelObtain.readLong();
                if (l.b(0, j)) {
                    parcelObtain.readInt();
                }
                if (l.b(1, j)) {
                    parcelObtain.readLong();
                }
                if (l.b(2, j)) {
                    parcelObtain.readInt();
                }
                if (l.b(3, j)) {
                }
                parcelObtain.recycle();
            }
            l7 = lValueOf;
        }
        if (l7 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new m(view, (int) (l7.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        m mVar = this.flutterIdToOrigin.get(i7);
        if (mVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f14350a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(mVar.f14351b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i7, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lA = l.a(this.reflectionAccessors, accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new m(view, (int) (lA.longValue() >> 32)));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i7, Rect rect) {
        Long l7;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f14344a;
        if (method == null) {
            l7 = null;
        } else {
            try {
                l7 = (Long) method.invoke(accessibilityNodeInfoCreateAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e7) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e7);
                l7 = null;
            } catch (InvocationTargetException e8) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e8);
                l7 = null;
            }
        }
        if (l7 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, (int) (l7.longValue() >> 32), i7);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i7, view);
    }

    public boolean onAccessibilityHoverEvent(int i7, MotionEvent motionEvent) {
        m mVar = this.flutterIdToOrigin.get(i7);
        if (mVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f14350a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < motionEvent.getPointerCount(); i8++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i8] = pointerProperties;
            motionEvent.getPointerProperties(i8, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i8, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i8] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i7, int i8, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        m mVar = this.flutterIdToOrigin.get(i7);
        if (mVar == null || (accessibilityNodeProvider = mVar.f14350a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(mVar.f14351b, i8, bundle);
    }

    public View platformViewOfNode(int i7) {
        m mVar = this.flutterIdToOrigin.get(i7);
        if (mVar == null) {
            return null;
        }
        return mVar.f14350a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = l.a(this.reflectionAccessors, accessibilityEvent);
        if (lA == null) {
            return false;
        }
        int iLongValue = (int) (lA.longValue() >> 32);
        Integer num = this.originToFlutterId.get(new m(view, iLongValue));
        if (num == null) {
            int i7 = this.nextFlutterId;
            this.nextFlutterId = i7 + 1;
            Integer numValueOf = Integer.valueOf(i7);
            cacheVirtualIdMappings(view, iLongValue, i7);
            num = numValueOf;
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i8 = 0; i8 < accessibilityEventObtain.getRecordCount(); i8++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i8);
            Long lA2 = l.a(this.reflectionAccessors, record);
            if (lA2 == null) {
                return false;
            }
            m mVar = new m(view, (int) (lA2.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(mVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(mVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
