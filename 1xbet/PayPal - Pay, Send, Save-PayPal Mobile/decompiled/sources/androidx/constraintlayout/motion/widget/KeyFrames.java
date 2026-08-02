package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class KeyFrames {
    public static final int UNSET = -1;
    static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> getHighSpeedVideoFpsRangesFor;
    private java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();

    static {
        java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> hashMap = new java.util.HashMap<>();
        getHighSpeedVideoFpsRangesFor = hashMap;
        try {
            hashMap.put("KeyAttribute", androidx.constraintlayout.motion.widget.KeyAttributes.class.getConstructor(new java.lang.Class[0]));
            getHighSpeedVideoFpsRangesFor.put(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.NAME, androidx.constraintlayout.motion.widget.KeyPosition.class.getConstructor(new java.lang.Class[0]));
            getHighSpeedVideoFpsRangesFor.put(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME, androidx.constraintlayout.motion.widget.KeyCycle.class.getConstructor(new java.lang.Class[0]));
            getHighSpeedVideoFpsRangesFor.put("KeyTimeCycle", androidx.constraintlayout.motion.widget.KeyTimeCycle.class.getConstructor(new java.lang.Class[0]));
            getHighSpeedVideoFpsRangesFor.put(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME, androidx.constraintlayout.motion.widget.KeyTrigger.class.getConstructor(new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key key) {
        if (!this.getHighSpeedVideoFpsRanges.containsKey(java.lang.Integer.valueOf(key.getHighSpeedVideoSizes))) {
            this.getHighSpeedVideoFpsRanges.put(java.lang.Integer.valueOf(key.getHighSpeedVideoSizes), new java.util.ArrayList<>());
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(key.getHighSpeedVideoSizes));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public KeyFrames() {
    }

    public KeyFrames(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        androidx.constraintlayout.motion.widget.Key keyTimeCycle;
        try {
            int eventType = xmlPullParser.getEventType();
            androidx.constraintlayout.motion.widget.Key key = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (getHighSpeedVideoFpsRangesFor.containsKey(name2)) {
                        switch (name2.hashCode()) {
                            case -300573030:
                                if (!name2.equals("KeyTimeCycle")) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("Key ");
                                    sb.append(name2);
                                    sb.append(" not found");
                                    throw new java.lang.NullPointerException(sb.toString());
                                }
                                keyTimeCycle = new androidx.constraintlayout.motion.widget.KeyTimeCycle();
                                keyTimeCycle.load(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                addKey(keyTimeCycle);
                                key = keyTimeCycle;
                                break;
                            case -298435811:
                                if (!name2.equals("KeyAttribute")) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append("Key ");
                                    sb2.append(name2);
                                    sb2.append(" not found");
                                    throw new java.lang.NullPointerException(sb2.toString());
                                }
                                keyTimeCycle = new androidx.constraintlayout.motion.widget.KeyAttributes();
                                keyTimeCycle.load(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                addKey(keyTimeCycle);
                                key = keyTimeCycle;
                                break;
                            case 540053991:
                                if (!name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME)) {
                                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                    sb22.append("Key ");
                                    sb22.append(name2);
                                    sb22.append(" not found");
                                    throw new java.lang.NullPointerException(sb22.toString());
                                }
                                keyTimeCycle = new androidx.constraintlayout.motion.widget.KeyCycle();
                                keyTimeCycle.load(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                addKey(keyTimeCycle);
                                key = keyTimeCycle;
                                break;
                            case 1153397896:
                                if (!name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.NAME)) {
                                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                                    sb222.append("Key ");
                                    sb222.append(name2);
                                    sb222.append(" not found");
                                    throw new java.lang.NullPointerException(sb222.toString());
                                }
                                keyTimeCycle = new androidx.constraintlayout.motion.widget.KeyPosition();
                                keyTimeCycle.load(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                addKey(keyTimeCycle);
                                key = keyTimeCycle;
                                break;
                            case 1308496505:
                                if (!name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME)) {
                                    java.lang.StringBuilder sb2222 = new java.lang.StringBuilder();
                                    sb2222.append("Key ");
                                    sb2222.append(name2);
                                    sb2222.append(" not found");
                                    throw new java.lang.NullPointerException(sb2222.toString());
                                }
                                keyTimeCycle = new androidx.constraintlayout.motion.widget.KeyTrigger();
                                keyTimeCycle.load(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                addKey(keyTimeCycle);
                                key = keyTimeCycle;
                                break;
                            default:
                                java.lang.StringBuilder sb22222 = new java.lang.StringBuilder();
                                sb22222.append("Key ");
                                sb22222.append(name2);
                                sb22222.append(" not found");
                                throw new java.lang.NullPointerException(sb22222.toString());
                        }
                        return;
                    }
                    if (name2.equalsIgnoreCase(androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_ATTRIBUTE)) {
                        if (key != null && key.Camera2StreamConfigurationMap != null) {
                            androidx.constraintlayout.widget.ConstraintAttribute.parse(context, xmlPullParser, key.Camera2StreamConfigurationMap);
                        }
                    } else if (name2.equalsIgnoreCase(androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_METHOD) && key != null && key.Camera2StreamConfigurationMap != null) {
                        androidx.constraintlayout.widget.ConstraintAttribute.parse(context, xmlPullParser, key.Camera2StreamConfigurationMap);
                    }
                } else if (eventType == 3 && androidx.constraintlayout.motion.widget.ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    public void addAllFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.getHighSpeedVideoFpsRanges.get(-1);
        if (arrayList != null) {
            motionController.getOutputStallDurationlomOqCM.addAll(arrayList);
        }
    }

    public void addFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(motionController.getInputFormats));
        if (arrayList != null) {
            motionController.getOutputStallDurationlomOqCM.addAll(arrayList);
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList2 = this.getHighSpeedVideoFpsRanges.get(-1);
        if (arrayList2 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.Key> it = arrayList2.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.motion.widget.Key next = it.next();
                java.lang.String str = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) motionController._BOUNDARY.getLayoutParams()).constraintTag;
                java.lang.String str2 = next.getHighSpeedVideoFpsRanges;
                if (str2 != null && str != null && str.matches(str2)) {
                    motionController.addKey(next);
                }
            }
        }
    }

    public java.util.Set<java.lang.Integer> getKeys() {
        return this.getHighSpeedVideoFpsRanges.keySet();
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getKeyFramesForView(int i) {
        return this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(i));
    }
}
