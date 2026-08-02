package androidx.core.content.pm;

/* loaded from: classes7.dex */
public class ShortcutXmlParser {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private static volatile java.util.ArrayList<java.lang.String> getHighSpeedVideoSizes;

    public static java.util.List<java.lang.String> getShortcutIds(android.content.Context context) {
        if (getHighSpeedVideoSizes == null) {
            synchronized (getHighSpeedVideoFpsRangesFor) {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = new java.util.ArrayList<>();
                    getHighSpeedVideoSizes.addAll(getHighSpeedVideoFpsRanges(context));
                }
            }
        }
        return getHighSpeedVideoSizes;
    }

    private ShortcutXmlParser() {
    }

    private static java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges(android.content.Context context) {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    android.content.pm.ActivityInfo activityInfo = it.next().activityInfo;
                    android.os.Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                        android.content.res.XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                        if (loadXmlMetaData != null) {
                            try {
                                hashSet.addAll(parseShortcutIds(loadXmlMetaData));
                                if (loadXmlMetaData != null) {
                                    loadXmlMetaData.close();
                                }
                            } finally {
                            }
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to open android.app.shortcuts meta-data resource of ");
                            sb.append(activityInfo.name);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return hashSet;
    }

    public static java.util.List<java.lang.String> parseShortcutIds(org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            java.lang.String name2 = xmlPullParser.getName();
            if (next == 2 && depth == 2 && "shortcut".equals(name2)) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "shortcutId");
                if (attributeValue == null) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "shortcutId");
                }
                if (attributeValue != null) {
                    arrayList.add(attributeValue);
                }
            }
        }
        return arrayList;
    }
}
