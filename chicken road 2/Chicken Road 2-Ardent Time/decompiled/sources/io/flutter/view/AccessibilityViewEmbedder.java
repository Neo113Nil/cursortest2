package io.flutter.view;

@androidx.annotation.Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final java.lang.String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final android.view.View rootAccessibilityView;
    private final io.flutter.view.l reflectionAccessors = new io.flutter.view.l();
    private final android.util.SparseArray<io.flutter.view.m> flutterIdToOrigin = new android.util.SparseArray<>();
    private final java.util.Map<io.flutter.view.m, java.lang.Integer> originToFlutterId = new java.util.HashMap();
    private final java.util.Map<android.view.View, android.graphics.Rect> embeddedViewToDisplayBounds = new java.util.HashMap();

    public AccessibilityViewEmbedder(android.view.View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        java.lang.Long l2;
        int i2;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            io.flutter.view.l lVar = this.reflectionAccessors;
            java.lang.reflect.Method method = lVar.f7915f;
            java.lang.Long l3 = null;
            java.lang.reflect.Field field = lVar.f7914e;
            java.lang.reflect.Method method2 = lVar.f7913d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l2 = (java.lang.Long) method2.invoke(accessibilityNodeInfo, java.lang.Integer.valueOf(i3));
                    } catch (java.lang.IllegalAccessException e2) {
                        android.util.Log.w(TAG, "Failed to access getChildId method.", e2);
                    } catch (java.lang.reflect.InvocationTargetException e3) {
                        android.util.Log.w(TAG, "The getChildId method threw an exception when invoked.", e3);
                    }
                } else {
                    try {
                        l2 = (java.lang.Long) method.invoke(field.get(accessibilityNodeInfo), java.lang.Integer.valueOf(i3));
                        l2.getClass();
                    } catch (java.lang.ArrayIndexOutOfBoundsException e4) {
                        e = e4;
                        android.util.Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        if (l3 != null) {
                        }
                    } catch (java.lang.IllegalAccessException e5) {
                        android.util.Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e5);
                    } catch (java.lang.reflect.InvocationTargetException e6) {
                        e = e6;
                        android.util.Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        if (l3 != null) {
                        }
                    }
                }
                l3 = l2;
            }
            if (l3 != null) {
                int longValue = (int) (l3.longValue() >> 32);
                io.flutter.view.m mVar = new io.flutter.view.m(view, longValue);
                if (this.originToFlutterId.containsKey(mVar)) {
                    i2 = this.originToFlutterId.get(mVar).intValue();
                } else {
                    int i4 = this.nextFlutterId;
                    this.nextFlutterId = i4 + 1;
                    cacheVirtualIdMappings(view, longValue, i4);
                    i2 = i4;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i2);
            }
        }
    }

    private void cacheVirtualIdMappings(android.view.View view, int i2, int i3) {
        io.flutter.view.m mVar = new io.flutter.view.m(view, i2);
        this.originToFlutterId.put(mVar, java.lang.Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, mVar);
    }

    private android.view.accessibility.AccessibilityNodeInfo convertToFlutterNode(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i2, android.view.View view) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i2);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        android.graphics.Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        java.util.List availableExtraData;
        java.lang.CharSequence hintText;
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
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        java.lang.Long l2;
        java.lang.reflect.Method method = this.reflectionAccessors.f7911b;
        if (method != null) {
            try {
                l2 = (java.lang.Long) method.invoke(accessibilityNodeInfo, null);
                l2.getClass();
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w(TAG, "Failed to access getParentNodeId method.", e2);
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e3);
            }
            if (l2 != null) {
                return;
            }
            java.lang.Integer num = this.originToFlutterId.get(new io.flutter.view.m(view, (int) (l2.longValue() >> 32)));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.util.Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
        } else {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (io.flutter.view.l.b(0, readLong)) {
                obtain2.readInt();
            }
            if (io.flutter.view.l.b(1, readLong)) {
                obtain2.readLong();
            }
            if (io.flutter.view.l.b(2, readLong)) {
                obtain2.readInt();
            }
            r1 = io.flutter.view.l.b(3, readLong) ? java.lang.Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
        }
        l2 = r1;
        if (l2 != null) {
        }
    }

    private void setFlutterNodesTranslateBounds(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo;
        io.flutter.view.m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = mVar.f7916a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(mVar.f7917b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public java.lang.Integer getRecordFlutterId(android.view.View view, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.Long a2 = io.flutter.view.l.a(this.reflectionAccessors, accessibilityRecord);
        if (a2 == null) {
            return null;
        }
        return this.originToFlutterId.get(new io.flutter.view.m(view, (int) (a2.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View view, int i2, android.graphics.Rect rect) {
        java.lang.Long l2;
        android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        java.lang.reflect.Method method = this.reflectionAccessors.f7910a;
        if (method != null) {
            try {
                l2 = (java.lang.Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w(TAG, "Failed to access getSourceNodeId method.", e2);
            } catch (java.lang.reflect.InvocationTargetException e3) {
                android.util.Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e3);
            }
            if (l2 != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l2.longValue() >> 32), i2);
            return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
        }
        l2 = null;
        if (l2 != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i2, android.view.MotionEvent motionEvent) {
        io.flutter.view.m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return false;
        }
        java.util.Map<android.view.View, android.graphics.Rect> map = this.embeddedViewToDisplayBounds;
        android.view.View view = mVar.f7916a;
        android.graphics.Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerPropertiesArr[i3] = pointerProperties;
            motionEvent.getPointerProperties(i3, pointerProperties);
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i3, pointerCoords);
            android.view.MotionEvent.PointerCoords pointerCoords2 = new android.view.MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i2, int i3, android.os.Bundle bundle) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider;
        io.flutter.view.m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null || (accessibilityNodeProvider = mVar.f7916a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(mVar.f7917b, i3, bundle);
    }

    public android.view.View platformViewOfNode(int i2) {
        io.flutter.view.m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        return mVar.f7916a;
    }

    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(accessibilityEvent);
        java.lang.Long a2 = io.flutter.view.l.a(this.reflectionAccessors, accessibilityEvent);
        if (a2 == null) {
            return false;
        }
        int longValue = (int) (a2.longValue() >> 32);
        java.lang.Integer num = this.originToFlutterId.get(new io.flutter.view.m(view, longValue));
        if (num == null) {
            int i2 = this.nextFlutterId;
            this.nextFlutterId = i2 + 1;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            cacheVirtualIdMappings(view, longValue, i2);
            num = valueOf;
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i3 = 0; i3 < obtain.getRecordCount(); i3++) {
            android.view.accessibility.AccessibilityRecord record = obtain.getRecord(i3);
            java.lang.Long a3 = io.flutter.view.l.a(this.reflectionAccessors, record);
            if (a3 == null) {
                return false;
            }
            io.flutter.view.m mVar = new io.flutter.view.m(view, (int) (a3.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(mVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(mVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
