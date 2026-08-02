package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateManager;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "clear", "()V", "", "isEmpty", "()Z", "", "version", "Lcom/adobe/marketing/mobile/SharedStateResult;", "resolve", "(I)Lcom/adobe/marketing/mobile/SharedStateResult;", "resolveLastSet", "p0", "Lcom/adobe/marketing/mobile/internal/eventhub/SharedState;", "p1", "getHighSpeedVideoFpsRanges", "(ILcom/adobe/marketing/mobile/internal/eventhub/SharedState;)Z", "setPendingState", "(I)Z", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setState", "(ILjava/util/Map;)Z", "updatePendingState", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/TreeMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/TreeMap;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SharedStateManager {
    public static final int VERSION_LATEST = Integer.MAX_VALUE;
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.TreeMap<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState> getHighSpeedVideoSizes;

    public SharedStateManager(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharedStateManager(");
        sb.append(str);
        sb.append(')');
        this.getHighSpeedVideoFpsRanges = sb.toString();
        this.getHighSpeedVideoSizes = new java.util.TreeMap<>();
    }

    public final boolean setState(int version, java.util.Map<java.lang.String, ? extends java.lang.Object> data) {
        boolean highSpeedVideoFpsRanges;
        synchronized (this) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(version, new com.adobe.marketing.mobile.internal.eventhub.SharedState(version, com.adobe.marketing.mobile.SharedStateStatus.SET, data));
        }
        return highSpeedVideoFpsRanges;
    }

    public final boolean setPendingState(int version) {
        boolean highSpeedVideoFpsRanges;
        synchronized (this) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(version, new com.adobe.marketing.mobile.internal.eventhub.SharedState(version, com.adobe.marketing.mobile.SharedStateStatus.PENDING, resolve(Integer.MAX_VALUE).getValue()));
        }
        return highSpeedVideoFpsRanges;
    }

    public final boolean updatePendingState(int version, java.util.Map<java.lang.String, ? extends java.lang.Object> data) {
        synchronized (this) {
            com.adobe.marketing.mobile.internal.eventhub.SharedState sharedState = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(version));
            if (sharedState == null) {
                return false;
            }
            if (sharedState.getHighResolutionOutputSizeshNQ4ISI != com.adobe.marketing.mobile.SharedStateStatus.PENDING) {
                return false;
            }
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(version), new com.adobe.marketing.mobile.internal.eventhub.SharedState(version, com.adobe.marketing.mobile.SharedStateStatus.SET, data));
            return true;
        }
    }

    public final com.adobe.marketing.mobile.SharedStateResult resolve(int version) {
        com.adobe.marketing.mobile.SharedStateResult sharedStateResult;
        com.adobe.marketing.mobile.internal.eventhub.SharedState value;
        synchronized (this) {
            java.util.Map.Entry<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState> floorEntry = this.getHighSpeedVideoSizes.floorEntry(java.lang.Integer.valueOf(version));
            com.adobe.marketing.mobile.internal.eventhub.SharedState value2 = floorEntry != null ? floorEntry.getValue() : null;
            if (value2 == null) {
                java.util.Map.Entry<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState> firstEntry = this.getHighSpeedVideoSizes.firstEntry();
                if (firstEntry == null || (value = firstEntry.getValue()) == null) {
                    sharedStateResult = new com.adobe.marketing.mobile.SharedStateResult(com.adobe.marketing.mobile.SharedStateStatus.NONE, null);
                } else {
                    sharedStateResult = new com.adobe.marketing.mobile.SharedStateResult(value.getHighResolutionOutputSizeshNQ4ISI, value.getHighSpeedVideoSizes);
                }
                return sharedStateResult;
            }
            return new com.adobe.marketing.mobile.SharedStateResult(value2.getHighResolutionOutputSizeshNQ4ISI, value2.getHighSpeedVideoSizes);
        }
    }

    public final com.adobe.marketing.mobile.SharedStateResult resolveLastSet(int version) {
        com.adobe.marketing.mobile.SharedStateResult sharedStateResult;
        synchronized (this) {
            java.util.SortedMap<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState> tailMap = this.getHighSpeedVideoSizes.descendingMap().tailMap(java.lang.Integer.valueOf(version));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tailMap, "");
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState>> it = tailMap.entrySet().iterator();
            while (it.hasNext()) {
                com.adobe.marketing.mobile.internal.eventhub.SharedState value = it.next().getValue();
                if (value.getHighResolutionOutputSizeshNQ4ISI != com.adobe.marketing.mobile.SharedStateStatus.PENDING) {
                    return new com.adobe.marketing.mobile.SharedStateResult(value.getHighResolutionOutputSizeshNQ4ISI, value.getHighSpeedVideoSizes);
                }
            }
            java.util.Map.Entry<java.lang.Integer, com.adobe.marketing.mobile.internal.eventhub.SharedState> firstEntry = this.getHighSpeedVideoSizes.firstEntry();
            com.adobe.marketing.mobile.internal.eventhub.SharedState value2 = firstEntry != null ? firstEntry.getValue() : null;
            if ((value2 != null ? value2.getHighResolutionOutputSizeshNQ4ISI : null) != com.adobe.marketing.mobile.SharedStateStatus.SET) {
                sharedStateResult = new com.adobe.marketing.mobile.SharedStateResult(com.adobe.marketing.mobile.SharedStateStatus.NONE, null);
            } else {
                sharedStateResult = new com.adobe.marketing.mobile.SharedStateResult(value2.getHighResolutionOutputSizeshNQ4ISI, value2.getHighSpeedVideoSizes);
            }
            return sharedStateResult;
        }
    }

    public final void clear() {
        synchronized (this) {
            this.getHighSpeedVideoSizes.clear();
        }
    }

    public final boolean isEmpty() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoSizes.size() == 0;
        }
        return z;
    }

    private final boolean getHighSpeedVideoFpsRanges(int p0, com.adobe.marketing.mobile.internal.eventhub.SharedState p1) {
        if (this.getHighSpeedVideoSizes.ceilingEntry(java.lang.Integer.valueOf(p0)) != null) {
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(" shared state at version ");
            sb.append(p0);
            sb.append(". More recent state exists.");
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, str, sb.toString(), new java.lang.Object[0]);
            return false;
        }
        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(p0), p1);
        return true;
    }
}
