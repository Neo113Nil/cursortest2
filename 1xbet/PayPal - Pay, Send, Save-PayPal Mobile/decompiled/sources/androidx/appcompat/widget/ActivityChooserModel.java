package androidx.appcompat.widget;

/* loaded from: classes5.dex */
class ActivityChooserModel extends android.database.DataSetObservable {
    static final java.lang.String Camera2StreamConfigurationMap = "ActivityChooserModel";
    final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener getHighSpeedVideoFpsRangesFor;
    android.content.Intent getInputSizeshNQ4ISI;
    final java.lang.String getOutputFormats;
    private static final java.lang.Object getOutputSizes = new java.lang.Object();
    private static final java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> getOutputMinFrameDuration = new java.util.HashMap();
    final java.lang.Object getInputFormats = new java.lang.Object();
    final java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> getHighSpeedVideoSizes = new java.util.ArrayList();
    private final java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
    private androidx.appcompat.widget.ActivityChooserModel.ActivitySorter getOutputStallDurationlomOqCM = new androidx.appcompat.widget.ActivityChooserModel.DefaultSorter();
    private int getOutputSizeshNQ4ISI = 50;
    boolean getHighSpeedVideoFpsRanges = true;
    private boolean isOutputSupportedForhNQ4ISI = false;
    private boolean getOutputStallDuration = true;
    boolean getHighSpeedVideoSizesFor = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel activityChooserModel);
    }

    public interface ActivitySorter {
        void sort(android.content.Intent intent, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list2);
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(androidx.appcompat.widget.ActivityChooserModel activityChooserModel, android.content.Intent intent);
    }

    public static androidx.appcompat.widget.ActivityChooserModel getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str) {
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel;
        synchronized (getOutputSizes) {
            java.util.Map<java.lang.String, androidx.appcompat.widget.ActivityChooserModel> map = getOutputMinFrameDuration;
            activityChooserModel = map.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new androidx.appcompat.widget.ActivityChooserModel(context, str);
                map.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    private ActivityChooserModel(android.content.Context context, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = context.getApplicationContext();
        if (!android.text.TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(".xml");
            this.getOutputFormats = sb.toString();
            return;
        }
        this.getOutputFormats = str;
    }

    public final int getHighSpeedVideoFpsRangesFor() {
        int size;
        synchronized (this.getInputFormats) {
            getHighSpeedVideoSizes();
            size = this.getHighSpeedVideoSizes.size();
        }
        return size;
    }

    public final android.content.pm.ResolveInfo getHighResolutionOutputSizeshNQ4ISI(int i) {
        android.content.pm.ResolveInfo resolveInfo;
        synchronized (this.getInputFormats) {
            getHighSpeedVideoSizes();
            resolveInfo = this.getHighSpeedVideoSizes.get(i).resolveInfo;
        }
        return resolveInfo;
    }

    public final int getHighSpeedVideoFpsRanges(android.content.pm.ResolveInfo resolveInfo) {
        synchronized (this.getInputFormats) {
            getHighSpeedVideoSizes();
            java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list = this.getHighSpeedVideoSizes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).resolveInfo == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final android.content.Intent getHighSpeedVideoFpsRanges(int i) {
        synchronized (this.getInputFormats) {
            if (this.getInputSizeshNQ4ISI == null) {
                return null;
            }
            getHighSpeedVideoSizes();
            androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = this.getHighSpeedVideoSizes.get(i);
            android.content.ComponentName componentName = new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
            android.content.Intent intent = new android.content.Intent(this.getInputSizeshNQ4ISI);
            intent.setComponent(componentName);
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                if (this.getHighSpeedVideoFpsRangesFor.onChooseActivity(this, new android.content.Intent(intent))) {
                    return null;
                }
            }
            getHighSpeedVideoSizes(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(componentName, java.lang.System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final android.content.pm.ResolveInfo Camera2StreamConfigurationMap() {
        synchronized (this.getInputFormats) {
            getHighSpeedVideoSizes();
            if (this.getHighSpeedVideoSizes.isEmpty()) {
                return null;
            }
            return this.getHighSpeedVideoSizes.get(0).resolveInfo;
        }
    }

    public final int getHighSpeedVideoFpsRanges() {
        int size;
        synchronized (this.getInputFormats) {
            getHighSpeedVideoSizes();
            size = this.getOutputMinFrameDurationlomOqCM.size();
        }
        return size;
    }

    private boolean getHighSpeedVideoSizesFor() {
        if (this.getOutputStallDurationlomOqCM == null || this.getInputSizeshNQ4ISI == null || this.getHighSpeedVideoSizes.isEmpty() || this.getOutputMinFrameDurationlomOqCM.isEmpty()) {
            return false;
        }
        this.getOutputStallDurationlomOqCM.sort(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, java.util.Collections.unmodifiableList(this.getOutputMinFrameDurationlomOqCM));
        return true;
    }

    final boolean getHighSpeedVideoSizes(androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord) {
        boolean add = this.getOutputMinFrameDurationlomOqCM.add(historicalRecord);
        if (add) {
            this.getOutputStallDuration = true;
            getHighResolutionOutputSizeshNQ4ISI();
            if (!this.isOutputSupportedForhNQ4ISI) {
                throw new java.lang.IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (this.getOutputStallDuration) {
                this.getOutputStallDuration = false;
                if (!android.text.TextUtils.isEmpty(this.getOutputFormats)) {
                    new androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask().executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.util.ArrayList(this.getOutputMinFrameDurationlomOqCM), this.getOutputFormats);
                }
            }
            getHighSpeedVideoSizesFor();
            notifyChanged();
        }
        return add;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int size = this.getOutputMinFrameDurationlomOqCM.size() - this.getOutputSizeshNQ4ISI;
        if (size > 0) {
            this.getOutputStallDuration = true;
            for (int i = 0; i < size; i++) {
                this.getOutputMinFrameDurationlomOqCM.remove(0);
            }
        }
    }

    public static final class HistoricalRecord {
        public final android.content.ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(java.lang.String str, long j, float f) {
            this(android.content.ComponentName.unflattenFromString(str), j, f);
        }

        public HistoricalRecord(android.content.ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public final int hashCode() {
            android.content.ComponentName componentName = this.activity;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.time;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.weight);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) obj;
            android.content.ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && java.lang.Float.floatToIntBits(this.weight) == java.lang.Float.floatToIntBits(historicalRecord.weight);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[; activity:");
            sb.append(this.activity);
            sb.append("; time:");
            sb.append(this.time);
            sb.append("; weight:");
            sb.append(new java.math.BigDecimal(this.weight));
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class ActivityResolveInfo implements java.lang.Comparable<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> {
        public final android.content.pm.ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(android.content.pm.ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public final int hashCode() {
            return java.lang.Float.floatToIntBits(this.weight) + 31;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && java.lang.Float.floatToIntBits(this.weight) == java.lang.Float.floatToIntBits(((androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo) obj).weight);
        }

        @Override // java.lang.Comparable
        public final int compareTo(androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo) {
            return java.lang.Float.floatToIntBits(activityResolveInfo.weight) - java.lang.Float.floatToIntBits(this.weight);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[resolveInfo:");
            sb.append(this.resolveInfo.toString());
            sb.append("; weight:");
            sb.append(new java.math.BigDecimal(this.weight));
            sb.append("]");
            return sb.toString();
        }
    }

    static final class DefaultSorter implements androidx.appcompat.widget.ActivityChooserModel.ActivitySorter {
        private final java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

        DefaultSorter() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public final void sort(android.content.Intent intent, java.util.List<androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> list, java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list2) {
            java.util.Map<android.content.ComponentName, androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo> map = this.getHighSpeedVideoFpsRangesFor;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = list.get(i);
                activityResolveInfo.weight = 0.0f;
                map.put(new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), activityResolveInfo);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = list2.get(size2);
                androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= 0.95f;
                }
            }
            java.util.Collections.sort(list);
        }
    }

    final class PersistHistoryAsyncTask extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {
        PersistHistoryAsyncTask() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        
            if (r14 != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
        
            r14.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
        
            if (r14 != null) goto L36;
         */
        @Override // android.os.AsyncTask
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Void doInBackground(java.lang.Object... objArr) {
            java.util.List list = (java.util.List) objArr[0];
            try {
                java.io.FileOutputStream openFileOutput = androidx.appcompat.widget.ActivityChooserModel.this.getHighResolutionOutputSizeshNQ4ISI.openFileOutput((java.lang.String) objArr[1], 0);
                org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
                try {
                    try {
                        try {
                            try {
                                newSerializer.setOutput(openFileOutput, null);
                                newSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
                                newSerializer.startTag(null, "historical-records");
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord historicalRecord = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) list.remove(0);
                                    newSerializer.startTag(null, "historical-record");
                                    newSerializer.attribute(null, "activity", historicalRecord.activity.flattenToString());
                                    newSerializer.attribute(null, "time", java.lang.String.valueOf(historicalRecord.time));
                                    newSerializer.attribute(null, "weight", java.lang.String.valueOf(historicalRecord.weight));
                                    newSerializer.endTag(null, "historical-record");
                                }
                                newSerializer.endTag(null, "historical-records");
                                newSerializer.endDocument();
                                androidx.appcompat.widget.ActivityChooserModel.this.getHighSpeedVideoFpsRanges = true;
                            } catch (java.lang.IllegalStateException unused) {
                                java.lang.String str = androidx.appcompat.widget.ActivityChooserModel.Camera2StreamConfigurationMap;
                                java.lang.String str2 = androidx.appcompat.widget.ActivityChooserModel.this.getOutputFormats;
                                androidx.appcompat.widget.ActivityChooserModel.this.getHighSpeedVideoFpsRanges = true;
                            }
                        } catch (java.io.IOException unused2) {
                            java.lang.String str3 = androidx.appcompat.widget.ActivityChooserModel.Camera2StreamConfigurationMap;
                            java.lang.String str4 = androidx.appcompat.widget.ActivityChooserModel.this.getOutputFormats;
                            androidx.appcompat.widget.ActivityChooserModel.this.getHighSpeedVideoFpsRanges = true;
                        }
                    } catch (java.lang.IllegalArgumentException unused3) {
                        java.lang.String str5 = androidx.appcompat.widget.ActivityChooserModel.Camera2StreamConfigurationMap;
                        java.lang.String str6 = androidx.appcompat.widget.ActivityChooserModel.this.getOutputFormats;
                        androidx.appcompat.widget.ActivityChooserModel.this.getHighSpeedVideoFpsRanges = true;
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    androidx.appcompat.widget.ActivityChooserModel.this.getHighSpeedVideoFpsRanges = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused5) {
                java.lang.String str7 = androidx.appcompat.widget.ActivityChooserModel.Camera2StreamConfigurationMap;
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0082, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        if (r3 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d6, code lost:
    
        if (r3 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoSizes() {
        boolean z;
        boolean z2 = true;
        if (!this.getHighSpeedVideoSizesFor || this.getInputSizeshNQ4ISI == null) {
            z = false;
        } else {
            this.getHighSpeedVideoSizesFor = false;
            this.getHighSpeedVideoSizes.clear();
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.getHighResolutionOutputSizeshNQ4ISI.getPackageManager().queryIntentActivities(this.getInputSizeshNQ4ISI, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoSizes.add(new androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo(queryIntentActivities.get(i)));
            }
            z = true;
        }
        if (this.getHighSpeedVideoFpsRanges && this.getOutputStallDuration && !android.text.TextUtils.isEmpty(this.getOutputFormats)) {
            this.getHighSpeedVideoFpsRanges = false;
            this.isOutputSupportedForhNQ4ISI = true;
            try {
                java.io.FileInputStream openFileInput = this.getHighResolutionOutputSizeshNQ4ISI.openFileInput(this.getOutputFormats);
                try {
                    org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i2 = 0; i2 != 1 && i2 != 2; i2 = newPullParser.next()) {
                    }
                    if (!"historical-records".equals(newPullParser.getName())) {
                        throw new org.xmlpull.v1.XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    java.util.List<androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord> list = this.getOutputMinFrameDurationlomOqCM;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next != 3 && next != 4) {
                                if (!"historical-record".equals(newPullParser.getName())) {
                                    throw new org.xmlpull.v1.XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(newPullParser.getAttributeValue(null, "activity"), java.lang.Long.parseLong(newPullParser.getAttributeValue(null, "time")), java.lang.Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            }
                        }
                    }
                } catch (java.io.IOException unused) {
                } catch (org.xmlpull.v1.XmlPullParserException unused2) {
                } catch (java.lang.Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException | java.io.IOException unused4) {
            }
        } else {
            z2 = false;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        if (z || z2) {
            getHighSpeedVideoSizesFor();
            notifyChanged();
        }
    }
}
