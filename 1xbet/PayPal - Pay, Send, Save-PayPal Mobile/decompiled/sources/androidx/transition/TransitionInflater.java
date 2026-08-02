package androidx.transition;

/* loaded from: classes7.dex */
public class TransitionInflater {
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private static final java.lang.Class<?>[] getHighResolutionOutputSizeshNQ4ISI = {android.content.Context.class, android.util.AttributeSet.class};
    private static final androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Constructor<?>> Camera2StreamConfigurationMap = new androidx.collection.ArrayMap<>();

    private TransitionInflater(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context;
    }

    public static androidx.transition.TransitionInflater from(android.content.Context context) {
        return new androidx.transition.TransitionInflater(context);
    }

    public androidx.transition.Transition inflateTransition(int i) {
        android.content.res.XmlResourceParser xml = this.getHighSpeedVideoFpsRanges.getResources().getXml(i);
        try {
            try {
                return Camera2StreamConfigurationMap(xml, android.util.Xml.asAttributeSet(xml), null);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(xml.getPositionDescription());
                sb.append(": ");
                sb.append(e.getMessage());
                throw new android.view.InflateException(sb.toString(), e);
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                throw new android.view.InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b5, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.transition.TransitionManager inflateTransitionManager(int i, android.view.ViewGroup viewGroup) {
        androidx.transition.Transition inflateTransition;
        android.content.res.XmlResourceParser xml = this.getHighSpeedVideoFpsRanges.getResources().getXml(i);
        try {
            try {
                android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xml);
                int depth = xml.getDepth();
                androidx.transition.TransitionManager transitionManager = null;
                while (true) {
                    int next = xml.next();
                    if ((next != 3 || xml.getDepth() > depth) && next != 1) {
                        if (next == 2) {
                            java.lang.String name2 = xml.getName();
                            if (name2.equals("transitionManager")) {
                                transitionManager = new androidx.transition.TransitionManager();
                            } else {
                                if (!name2.equals("transition") || transitionManager == null) {
                                    break;
                                }
                                android.content.res.TypedArray obtainStyledAttributes = this.getHighSpeedVideoFpsRanges.obtainStyledAttributes(asAttributeSet, androidx.transition.Styleable.getInputFormats);
                                int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xml, "transition", 2, -1);
                                int namedResourceId2 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xml, "fromScene", 0, -1);
                                androidx.transition.Scene sceneForLayout = namedResourceId2 < 0 ? null : androidx.transition.Scene.getSceneForLayout(viewGroup, namedResourceId2, this.getHighSpeedVideoFpsRanges);
                                int namedResourceId3 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xml, "toScene", 1, -1);
                                androidx.transition.Scene sceneForLayout2 = namedResourceId3 < 0 ? null : androidx.transition.Scene.getSceneForLayout(viewGroup, namedResourceId3, this.getHighSpeedVideoFpsRanges);
                                if (namedResourceId >= 0 && (inflateTransition = inflateTransition(namedResourceId)) != null) {
                                    if (sceneForLayout2 == null) {
                                        throw new java.lang.RuntimeException("No toScene for transition ID ".concat(java.lang.String.valueOf(namedResourceId)));
                                    }
                                    if (sceneForLayout == null) {
                                        transitionManager.setTransition(sceneForLayout2, inflateTransition);
                                    } else {
                                        transitionManager.setTransition(sceneForLayout, sceneForLayout2, inflateTransition);
                                    }
                                }
                                obtainStyledAttributes.recycle();
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown scene name: ");
                sb.append(xml.getName());
                throw new java.lang.RuntimeException(sb.toString());
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(xml.getPositionDescription());
                sb2.append(": ");
                sb2.append(e.getMessage());
                android.view.InflateException inflateException = new android.view.InflateException(sb2.toString());
                inflateException.initCause(e);
                throw inflateException;
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                android.view.InflateException inflateException2 = new android.view.InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0226, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private androidx.transition.Transition Camera2StreamConfigurationMap(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, androidx.transition.Transition transition) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        androidx.transition.TransitionSet transitionSet = transition instanceof androidx.transition.TransitionSet ? (androidx.transition.TransitionSet) transition : null;
        loop0: while (true) {
            androidx.transition.Transition transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        java.lang.String name2 = xmlPullParser.getName();
                        if ("fade".equals(name2)) {
                            transition2 = new androidx.transition.Fade(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("changeBounds".equals(name2)) {
                            transition2 = new androidx.transition.ChangeBounds(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("slide".equals(name2)) {
                            transition2 = new androidx.transition.Slide(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("explode".equals(name2)) {
                            transition2 = new androidx.transition.Explode(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("changeImageTransform".equals(name2)) {
                            transition2 = new androidx.transition.ChangeImageTransform(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("changeTransform".equals(name2)) {
                            transition2 = new androidx.transition.ChangeTransform(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("changeClipBounds".equals(name2)) {
                            transition2 = new androidx.transition.ChangeClipBounds(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if (androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_AUTO_TRANSITION.equals(name2)) {
                            transition2 = new androidx.transition.AutoTransition(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("changeScroll".equals(name2)) {
                            transition2 = new androidx.transition.ChangeScroll(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("transitionSet".equals(name2)) {
                            transition2 = new androidx.transition.TransitionSet(this.getHighSpeedVideoFpsRanges, attributeSet);
                        } else if ("transition".equals(name2)) {
                            transition2 = (androidx.transition.Transition) getHighSpeedVideoFpsRanges(attributeSet, androidx.transition.Transition.class, "transition");
                        } else if (!"targets".equals(name2)) {
                            if ("arcMotion".equals(name2)) {
                                if (transition == null) {
                                    throw new java.lang.RuntimeException("Invalid use of arcMotion element");
                                }
                                transition.setPathMotion(new androidx.transition.ArcMotion(this.getHighSpeedVideoFpsRanges, attributeSet));
                            } else if ("pathMotion".equals(name2)) {
                                if (transition != null) {
                                    transition.setPathMotion((androidx.transition.PathMotion) getHighSpeedVideoFpsRanges(attributeSet, androidx.transition.PathMotion.class, "pathMotion"));
                                } else {
                                    throw new java.lang.RuntimeException("Invalid use of pathMotion element");
                                }
                            } else {
                                if (!"patternPathMotion".equals(name2)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown scene name: ");
                                    sb.append(xmlPullParser.getName());
                                    throw new java.lang.RuntimeException(sb.toString());
                                }
                                if (transition == null) {
                                    throw new java.lang.RuntimeException("Invalid use of patternPathMotion element");
                                }
                                transition.setPathMotion(new androidx.transition.PatternPathMotion(this.getHighSpeedVideoFpsRanges, attributeSet));
                            }
                        } else {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == 3 && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                }
                                if (next2 == 2) {
                                    if (xmlPullParser.getName().equals(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET)) {
                                        android.content.res.TypedArray obtainStyledAttributes = this.getHighSpeedVideoFpsRanges.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getOutputFormats);
                                        int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                                        if (namedResourceId != 0) {
                                            transition.addTarget(namedResourceId);
                                        } else {
                                            int namedResourceId2 = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                                            if (namedResourceId2 != 0) {
                                                transition.excludeTarget(namedResourceId2, true);
                                            } else {
                                                java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                                                if (namedString != null) {
                                                    transition.addTarget(namedString);
                                                } else {
                                                    java.lang.String namedString2 = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                                    if (namedString2 != null) {
                                                        transition.excludeTarget(namedString2, true);
                                                    } else {
                                                        java.lang.String namedString3 = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                                        if (namedString3 != null) {
                                                            try {
                                                                transition.excludeTarget(java.lang.Class.forName(namedString3), true);
                                                            } catch (java.lang.ClassNotFoundException e) {
                                                                obtainStyledAttributes.recycle();
                                                                throw new java.lang.RuntimeException("Could not create ".concat(java.lang.String.valueOf(namedString3)), e);
                                                            }
                                                        } else {
                                                            java.lang.String namedString4 = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                                            if (namedString4 != null) {
                                                                transition.addTarget(java.lang.Class.forName(namedString4));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obtainStyledAttributes.recycle();
                                    } else {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown scene name: ");
                                        sb2.append(xmlPullParser.getName());
                                        throw new java.lang.RuntimeException(sb2.toString());
                                    }
                                }
                            }
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                Camera2StreamConfigurationMap(xmlPullParser, attributeSet, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            }
                            if (transition != null) {
                                throw new android.view.InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.addTransition(transition2);
        }
    }

    private java.lang.Object getHighSpeedVideoFpsRanges(android.util.AttributeSet attributeSet, java.lang.Class<?> cls, java.lang.String str) {
        java.lang.Object newInstance;
        java.lang.Class<? extends U> asSubclass;
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS);
        if (attributeValue == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" tag must have a 'class' attribute");
            throw new android.view.InflateException(sb.toString());
        }
        try {
            androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Constructor<?>> arrayMap = Camera2StreamConfigurationMap;
            synchronized (arrayMap) {
                java.lang.reflect.Constructor<?> constructor = arrayMap.get(attributeValue);
                if (constructor == null && (asSubclass = java.lang.Class.forName(attributeValue, false, this.getHighSpeedVideoFpsRanges.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = asSubclass.getConstructor(getHighResolutionOutputSizeshNQ4ISI);
                    constructor.setAccessible(true);
                    arrayMap.put(attributeValue, constructor);
                }
                newInstance = constructor.newInstance(this.getHighSpeedVideoFpsRanges, attributeSet);
            }
            return newInstance;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Could not instantiate ");
            sb2.append(cls);
            sb2.append(" class ");
            sb2.append(attributeValue);
            throw new android.view.InflateException(sb2.toString(), e);
        }
    }
}
