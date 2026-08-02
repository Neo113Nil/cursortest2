package androidx.preference;

/* loaded from: classes7.dex */
class PreferenceInflater {
    private final android.content.Context Camera2StreamConfigurationMap;
    private java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object[] getHighSpeedVideoFpsRanges = new java.lang.Object[2];
    private androidx.preference.PreferenceManager getOutputFormats;
    private static final java.lang.Class<?>[] getHighSpeedVideoSizes = {android.content.Context.class, android.util.AttributeSet.class};
    private static final java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();

    public PreferenceInflater(android.content.Context context, androidx.preference.PreferenceManager preferenceManager) {
        this.Camera2StreamConfigurationMap = context;
        this.getOutputFormats = preferenceManager;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(androidx.preference.Preference.class.getPackage().getName());
        sb.append(".");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(androidx.preference.SwitchPreference.class.getPackage().getName());
        sb2.append(".");
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.String[]{obj, sb2.toString()};
    }

    private androidx.preference.Preference getHighSpeedVideoSizes(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
            this.getHighSpeedVideoFpsRanges[0] = this.Camera2StreamConfigurationMap;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (org.xmlpull.v1.XmlPullParserException e) {
                            android.view.InflateException inflateException = new android.view.InflateException(e.getMessage());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    } catch (android.view.InflateException e2) {
                        throw e2;
                    }
                } catch (java.io.IOException e3) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(xmlPullParser.getPositionDescription());
                    sb.append(": ");
                    sb.append(e3.getMessage());
                    android.view.InflateException inflateException2 = new android.view.InflateException(sb.toString());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(xmlPullParser.getPositionDescription());
                sb2.append(": No start tag found!");
                throw new android.view.InflateException(sb2.toString());
            }
            androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) getHighSpeedVideoSizes(xmlPullParser.getName(), asAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.onAttachedToHierarchy(this.getOutputFormats);
                preferenceGroup = preferenceGroup2;
            }
            getHighResolutionOutputSizeshNQ4ISI(xmlPullParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    private androidx.preference.Preference getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr, android.util.AttributeSet attributeSet) throws java.lang.ClassNotFoundException, android.view.InflateException {
        java.lang.Class<?> cls;
        java.lang.reflect.Constructor<?> constructor = getHighSpeedVideoFpsRangesFor.get(str);
        if (constructor == null) {
            try {
                try {
                    java.lang.ClassLoader classLoader = this.Camera2StreamConfigurationMap.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        java.lang.ClassNotFoundException e = null;
                        for (java.lang.String str2 : strArr) {
                            try {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str2);
                                sb.append(str);
                                cls = java.lang.Class.forName(sb.toString(), false, classLoader);
                                break;
                            } catch (java.lang.ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(attributeSet.getPositionDescription());
                                sb2.append(": Error inflating class ");
                                sb2.append(str);
                                throw new android.view.InflateException(sb2.toString());
                            }
                            throw e;
                        }
                        constructor = cls.getConstructor(getHighSpeedVideoSizes);
                        constructor.setAccessible(true);
                        getHighSpeedVideoFpsRangesFor.put(str, constructor);
                    }
                    cls = java.lang.Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(getHighSpeedVideoSizes);
                    constructor.setAccessible(true);
                    getHighSpeedVideoFpsRangesFor.put(str, constructor);
                } catch (java.lang.ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (java.lang.Exception e4) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Error inflating class ");
                sb3.append(str);
                android.view.InflateException inflateException = new android.view.InflateException(sb3.toString());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        objArr[1] = attributeSet;
        return (androidx.preference.Preference) constructor.newInstance(objArr);
    }

    private androidx.preference.Preference getHighSpeedVideoSizes(java.lang.String str, android.util.AttributeSet attributeSet) {
        try {
            if (-1 != str.indexOf(46)) {
                return getHighSpeedVideoSizes(str, null, attributeSet);
            }
            return getHighSpeedVideoSizes(str, this.getHighResolutionOutputSizeshNQ4ISI, attributeSet);
        } catch (android.view.InflateException e) {
            throw e;
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class (not found)");
            sb.append(str);
            android.view.InflateException inflateException = new android.view.InflateException(sb.toString());
            inflateException.initCause(e2);
            throw inflateException;
        } catch (java.lang.Exception e3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Error inflating class ");
            sb2.append(str);
            android.view.InflateException inflateException2 = new android.view.InflateException(sb2.toString());
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.Preference preference, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                java.lang.String name2 = xmlPullParser.getName();
                if ("intent".equals(name2)) {
                    try {
                        preference.setIntent(android.content.Intent.parseIntent(this.Camera2StreamConfigurationMap.getResources(), xmlPullParser, attributeSet));
                    } catch (java.io.IOException e) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name2)) {
                    this.Camera2StreamConfigurationMap.getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (java.io.IOException e2) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException2 = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    androidx.preference.Preference highSpeedVideoSizes = getHighSpeedVideoSizes(name2, attributeSet);
                    ((androidx.preference.PreferenceGroup) preference).addItemFromInflater(highSpeedVideoSizes);
                    getHighResolutionOutputSizeshNQ4ISI(xmlPullParser, highSpeedVideoSizes, attributeSet);
                }
            }
        }
    }

    public final androidx.preference.Preference getHighResolutionOutputSizeshNQ4ISI(int i, androidx.preference.PreferenceGroup preferenceGroup) {
        android.content.res.XmlResourceParser xml = this.Camera2StreamConfigurationMap.getResources().getXml(i);
        try {
            return getHighSpeedVideoSizes(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }
}
