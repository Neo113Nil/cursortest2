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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final m reflectionAccessors = new m();
    private final SparseArray<n> flutterIdToOrigin = new SparseArray<>();
    private final Map<n, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i3) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l3;
        int i3;
        for (int i4 = 0; i4 < accessibilityNodeInfo.getChildCount(); i4++) {
            m mVar = this.reflectionAccessors;
            Method method = mVar.f;
            Field field = mVar.f9458e;
            Method method2 = mVar.f9457d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l3 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i4));
                    } catch (IllegalAccessException e3) {
                        Log.w(TAG, "Failed to access getChildId method.", e3);
                    } catch (InvocationTargetException e4) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e4);
                    }
                } else {
                    try {
                        l3 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i4));
                        l3.getClass();
                    } catch (ArrayIndexOutOfBoundsException e5) {
                        e = e5;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l3 = null;
                        if (l3 == null) {
                        }
                    } catch (IllegalAccessException e6) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e6);
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l3 = null;
                        if (l3 == null) {
                        }
                    }
                }
                if (l3 == null) {
                    int longValue = (int) (l3.longValue() >> 32);
                    n nVar = new n(view, longValue);
                    if (this.originToFlutterId.containsKey(nVar)) {
                        i3 = this.originToFlutterId.get(nVar).intValue();
                    } else {
                        int i5 = this.nextFlutterId;
                        this.nextFlutterId = i5 + 1;
                        cacheVirtualIdMappings(view, longValue, i5);
                        i3 = i5;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i3);
                }
            }
            l3 = null;
            if (l3 == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i3, int i4) {
        n nVar = new n(view, i3);
        this.originToFlutterId.put(nVar, Integer.valueOf(i4));
        this.flutterIdToOrigin.put(i4, nVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i3, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i3);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i3);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
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
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (Build.VERSION.SDK_INT >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l3;
        Method method = this.reflectionAccessors.f9455b;
        if (method != null) {
            try {
                l3 = (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
                l3.getClass();
            } catch (IllegalAccessException e3) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e3);
            } catch (InvocationTargetException e4) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e4);
            }
            if (l3 != null) {
                return;
            }
            Integer num = this.originToFlutterId.get(new n(view, (int) (l3.longValue() >> 32)));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (m.b(0, readLong)) {
                obtain2.readInt();
            }
            if (m.b(1, readLong)) {
                obtain2.readLong();
            }
            if (m.b(2, readLong)) {
                obtain2.readInt();
            }
            r4 = m.b(3, readLong) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
        }
        l3 = r4;
        if (l3 != null) {
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

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f9459a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(nVar.f9460b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i3, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a3 = m.a(this.reflectionAccessors, accessibilityRecord);
        if (a3 == null) {
            return null;
        }
        return this.originToFlutterId.get(new n(view, (int) (a3.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i3, Rect rect) {
        Long l3;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f9454a;
        if (method != null) {
            try {
                l3 = (Long) method.invoke(createAccessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e3);
            } catch (InvocationTargetException e4) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e4);
            }
            if (l3 != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l3.longValue() >> 32), i3);
            return convertToFlutterNode(createAccessibilityNodeInfo, i3, view);
        }
        l3 = null;
        if (l3 != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i3, MotionEvent motionEvent) {
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = nVar.f9459a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i4] = pointerProperties;
            motionEvent.getPointerProperties(i4, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i4, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i4] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i3, int i4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null || (accessibilityNodeProvider = nVar.f9459a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(nVar.f9460b, i4, bundle);
    }

    public View platformViewOfNode(int i3) {
        n nVar = this.flutterIdToOrigin.get(i3);
        if (nVar == null) {
            return null;
        }
        return nVar.f9459a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a3 = m.a(this.reflectionAccessors, accessibilityEvent);
        if (a3 != null) {
            int longValue = (int) (a3.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new n(view, longValue));
            if (num == null) {
                int i3 = this.nextFlutterId;
                this.nextFlutterId = i3 + 1;
                Integer valueOf = Integer.valueOf(i3);
                cacheVirtualIdMappings(view, longValue, i3);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i4 = 0; i4 < obtain.getRecordCount(); i4++) {
                AccessibilityRecord record = obtain.getRecord(i4);
                Long a4 = m.a(this.reflectionAccessors, record);
                if (a4 != null) {
                    n nVar = new n(view, (int) (a4.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(nVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(nVar).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
