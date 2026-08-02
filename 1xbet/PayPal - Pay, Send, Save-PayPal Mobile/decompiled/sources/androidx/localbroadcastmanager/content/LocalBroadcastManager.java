package androidx.localbroadcastmanager.content;

/* loaded from: classes7.dex */
public final class LocalBroadcastManager {
    private static androidx.localbroadcastmanager.content.LocalBroadcastManager getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private final android.content.Context Camera2StreamConfigurationMap;
    private final android.os.Handler getHighSpeedVideoFpsRanges;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> getInputFormats = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord>> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
    private final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord> getOutputFormats = new java.util.ArrayList<>();

    static final class ReceiverRecord {
        final android.content.BroadcastReceiver getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final android.content.IntentFilter getHighSpeedVideoSizes;

        ReceiverRecord(android.content.IntentFilter intentFilter, android.content.BroadcastReceiver broadcastReceiver) {
            this.getHighSpeedVideoSizes = intentFilter;
            this.getHighResolutionOutputSizeshNQ4ISI = broadcastReceiver;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" filter=");
            sb.append(this.getHighSpeedVideoSizes);
            if (this.getHighSpeedVideoFpsRanges) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    static final class BroadcastRecord {
        final java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> getHighSpeedVideoFpsRanges;
        final android.content.Intent getHighSpeedVideoFpsRangesFor;

        BroadcastRecord(android.content.Intent intent, java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList) {
            this.getHighSpeedVideoFpsRangesFor = intent;
            this.getHighSpeedVideoFpsRanges = arrayList;
        }
    }

    public static androidx.localbroadcastmanager.content.LocalBroadcastManager getInstance(android.content.Context context) {
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;
        synchronized (getHighSpeedVideoSizes) {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new androidx.localbroadcastmanager.content.LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = getHighResolutionOutputSizeshNQ4ISI;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(android.content.Context context) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = new android.os.Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (message.what == 1) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.this.getHighSpeedVideoSizes();
                } else {
                    super.handleMessage(message);
                }
            }
        };
    }

    public final void registerReceiver(android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        synchronized (this.getInputFormats) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = new androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord(intentFilter, broadcastReceiver);
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList = this.getInputFormats.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(1);
                this.getInputFormats.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                java.lang.String action = intentFilter.getAction(i);
                java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList2 = this.getHighSpeedVideoFpsRangesFor.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList<>(1);
                    this.getHighSpeedVideoFpsRangesFor.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public final void unregisterReceiver(android.content.BroadcastReceiver broadcastReceiver) {
        synchronized (this.getInputFormats) {
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> remove = this.getInputFormats.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = remove.get(size);
                receiverRecord.getHighSpeedVideoFpsRanges = true;
                for (int i = 0; i < receiverRecord.getHighSpeedVideoSizes.countActions(); i++) {
                    java.lang.String action = receiverRecord.getHighSpeedVideoSizes.getAction(i);
                    java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList = this.getHighSpeedVideoFpsRangesFor.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord2 = arrayList.get(size2);
                            if (receiverRecord2.getHighResolutionOutputSizeshNQ4ISI == broadcastReceiver) {
                                receiverRecord2.getHighSpeedVideoFpsRanges = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.getHighSpeedVideoFpsRangesFor.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final boolean sendBroadcast(android.content.Intent intent) {
        int i;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList2;
        java.lang.String str2;
        boolean z;
        synchronized (this.getInputFormats) {
            java.lang.String action = intent.getAction();
            java.lang.String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.Camera2StreamConfigurationMap.getContentResolver());
            android.net.Uri data = intent.getData();
            java.lang.String scheme = intent.getScheme();
            java.util.Set<java.lang.String> categories = intent.getCategories();
            boolean z2 = true;
            boolean z3 = (intent.getFlags() & 8) != 0;
            java.util.ArrayList<androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord> arrayList3 = this.getHighSpeedVideoFpsRangesFor.get(intent.getAction());
            if (arrayList3 != null) {
                java.util.ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = arrayList3.get(i2);
                    if (z3) {
                        android.content.IntentFilter intentFilter = receiverRecord.getHighSpeedVideoSizes;
                    }
                    if (receiverRecord.getHighSpeedVideoFpsRangesFor) {
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z = z2;
                    } else {
                        android.content.IntentFilter intentFilter2 = receiverRecord.getHighSpeedVideoSizes;
                        java.lang.String str3 = action;
                        java.lang.String str4 = resolveTypeIfNeeded;
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z = z2;
                        if (intentFilter2.match(str3, str4, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            arrayList4 = arrayList == null ? new java.util.ArrayList() : arrayList;
                            arrayList4.add(receiverRecord);
                            receiverRecord.getHighSpeedVideoFpsRangesFor = z;
                            i2 = i + 1;
                            z2 = z;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        }
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    z2 = z;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                java.util.ArrayList arrayList5 = arrayList4;
                boolean z4 = z2;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord) arrayList5.get(i3)).getHighSpeedVideoFpsRangesFor = false;
                    }
                    this.getOutputFormats.add(new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord(intent, arrayList5));
                    if (!this.getHighSpeedVideoFpsRanges.hasMessages(z4 ? 1 : 0)) {
                        this.getHighSpeedVideoFpsRanges.sendEmptyMessage(z4 ? 1 : 0);
                    }
                    return z4;
                }
            }
            return false;
        }
    }

    public final void sendBroadcastSync(android.content.Intent intent) {
        if (sendBroadcast(intent)) {
            getHighSpeedVideoSizes();
        }
    }

    final void getHighSpeedVideoSizes() {
        int size;
        androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.getInputFormats) {
                size = this.getOutputFormats.size();
                if (size <= 0) {
                    return;
                }
                broadcastRecordArr = new androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord[size];
                this.getOutputFormats.toArray(broadcastRecordArr);
                this.getOutputFormats.clear();
            }
            for (int i = 0; i < size; i++) {
                androidx.localbroadcastmanager.content.LocalBroadcastManager.BroadcastRecord broadcastRecord = broadcastRecordArr[i];
                int size2 = broadcastRecord.getHighSpeedVideoFpsRanges.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.ReceiverRecord receiverRecord = broadcastRecord.getHighSpeedVideoFpsRanges.get(i2);
                    if (!receiverRecord.getHighSpeedVideoFpsRanges) {
                        receiverRecord.getHighResolutionOutputSizeshNQ4ISI.onReceive(this.Camera2StreamConfigurationMap, broadcastRecord.getHighSpeedVideoFpsRangesFor);
                    }
                }
            }
        }
    }
}
