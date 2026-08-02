package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004-./0B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "<init>", "()V", "Landroidx/work/WorkInfo$State;", "state", "", "stateToInt", "(Landroidx/work/WorkInfo$State;)I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "intToState", "(I)Landroidx/work/WorkInfo$State;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffPolicyToInt", "(Landroidx/work/BackoffPolicy;)I", "intToBackoffPolicy", "(I)Landroidx/work/BackoffPolicy;", "Landroidx/work/NetworkType;", "networkType", "networkTypeToInt", "(Landroidx/work/NetworkType;)I", "intToNetworkType", "(I)Landroidx/work/NetworkType;", "Landroidx/work/OutOfQuotaPolicy;", "policy", "outOfQuotaPolicyToInt", "(Landroidx/work/OutOfQuotaPolicy;)I", "intToOutOfQuotaPolicy", "(I)Landroidx/work/OutOfQuotaPolicy;", "", "Landroidx/work/Constraints$ContentUriTrigger;", "triggers", "", "setOfTriggersToByteArray", "(Ljava/util/Set;)[B", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "byteArrayToSetOfTriggers", "([B)Ljava/util/Set;", "Landroidx/work/impl/utils/NetworkRequestCompat;", "toNetworkRequest$work_runtime_release", "([B)Landroidx/work/impl/utils/NetworkRequestCompat;", "requestCompat", "fromNetworkRequest$work_runtime_release", "(Landroidx/work/impl/utils/NetworkRequestCompat;)[B", "StateIds", "BackoffPolicyIds", "NetworkTypeIds", "OutOfPolicyIds"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkTypeConverters {
    public static final androidx.work.impl.model.WorkTypeConverters INSTANCE = new androidx.work.impl.model.WorkTypeConverters();

    private WorkTypeConverters() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "<init>", "()V", "", "ENQUEUED", com.visa.cbp.getEncExpo.warmup, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, "SUCCEEDED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "BLOCKED", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "", "COMPLETED_STATES", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final java.lang.String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final androidx.work.impl.model.WorkTypeConverters.StateIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$BackoffPolicyIds;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class BackoffPolicyIds {
        public static final androidx.work.impl.model.WorkTypeConverters.BackoffPolicyIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.BackoffPolicyIds();

        private BackoffPolicyIds() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$NetworkTypeIds;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class NetworkTypeIds {
        public static final androidx.work.impl.model.WorkTypeConverters.NetworkTypeIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.NetworkTypeIds();

        private NetworkTypeIds() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$OutOfPolicyIds;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class OutOfPolicyIds {
        public static final androidx.work.impl.model.WorkTypeConverters.OutOfPolicyIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.OutOfPolicyIds();

        private OutOfPolicyIds() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int stateToInt(androidx.work.WorkInfo.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        switch (androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkInfo.State intToState(int value) {
        if (value == 0) {
            return androidx.work.WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return androidx.work.WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return androidx.work.WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return androidx.work.WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return androidx.work.WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return androidx.work.WorkInfo.State.CANCELLED;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not convert ");
        sb.append(value);
        sb.append(" to State");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final int backoffPolicyToInt(androidx.work.BackoffPolicy backoffPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.BackoffPolicy intToBackoffPolicy(int value) {
        if (value == 0) {
            return androidx.work.BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.BackoffPolicy.LINEAR;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not convert ");
        sb.append(value);
        sb.append(" to BackoffPolicy");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final int networkTypeToInt(androidx.work.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not convert ");
        sb.append(networkType);
        sb.append(" to int");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.NetworkType intToNetworkType(int value) {
        if (value == 0) {
            return androidx.work.NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.NetworkType.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.NetworkType.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.NetworkType.METERED;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && value == 5) {
            return androidx.work.NetworkType.TEMPORARILY_UNMETERED;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not convert ");
        sb.append(value);
        sb.append(" to NetworkType");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final int outOfQuotaPolicyToInt(androidx.work.OutOfQuotaPolicy policy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not convert ");
        sb.append(value);
        sb.append(" to OutOfQuotaPolicy");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] setOfTriggersToByteArray(java.util.Set<androidx.work.Constraints.ContentUriTrigger> triggers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggers, "");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = objectOutputStream;
            objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                java.io.ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.writeInt(triggers.size());
                for (androidx.work.Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream2.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream2.writeBoolean(contentUriTrigger.getIsTriggeredForDescendants());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<androidx.work.Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        java.io.ObjectInputStream objectInputStream = byteArrayInputStream;
        try {
            java.io.ByteArrayInputStream byteArrayInputStream2 = objectInputStream;
            try {
                objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            try {
                java.io.ObjectInputStream objectInputStream2 = objectInputStream;
                int readInt = objectInputStream2.readInt();
                for (int i = 0; i < readInt; i++) {
                    android.net.Uri parse = android.net.Uri.parse(objectInputStream2.readUTF());
                    boolean readBoolean = objectInputStream2.readBoolean();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
                    linkedHashSet.add(new androidx.work.Constraints.ContentUriTrigger(parse, readBoolean));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectInputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.impl.utils.NetworkRequestCompat toNetworkRequest$work_runtime_release(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        if (android.os.Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new androidx.work.impl.utils.NetworkRequestCompat(null);
        }
        java.io.ObjectInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        try {
            byteArrayInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            try {
                java.io.ObjectInputStream objectInputStream = byteArrayInputStream;
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                androidx.work.impl.utils.NetworkRequestCompat createNetworkRequestCompat$work_runtime_release = androidx.work.impl.utils.NetworkRequest28.INSTANCE.createNetworkRequestCompat$work_runtime_release(iArr2, iArr);
                kotlin.io.CloseableKt.closeFinally(byteArrayInputStream, null);
                kotlin.io.CloseableKt.closeFinally(byteArrayInputStream, null);
                return createNetworkRequestCompat$work_runtime_release;
            } finally {
            }
        } finally {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] fromNetworkRequest$work_runtime_release(androidx.work.impl.utils.NetworkRequestCompat requestCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCompat, "");
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        android.net.NetworkRequest networkRequest = requestCompat.getNetworkRequest();
        if (networkRequest == null) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            objectOutputStream = new java.io.ObjectOutputStream(objectOutputStream);
            try {
                java.io.ObjectOutputStream objectOutputStream2 = objectOutputStream;
                int[] transportTypesCompat = androidx.work.impl.utils.NetworkRequestCompatKt.getTransportTypesCompat(networkRequest);
                int[] capabilitiesCompat = androidx.work.impl.utils.NetworkRequestCompatKt.getCapabilitiesCompat(networkRequest);
                objectOutputStream2.writeInt(transportTypesCompat.length);
                for (int i : transportTypesCompat) {
                    objectOutputStream2.writeInt(i);
                }
                objectOutputStream2.writeInt(capabilitiesCompat.length);
                for (int i2 : capabilitiesCompat) {
                    objectOutputStream2.writeInt(i2);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[androidx.work.WorkInfo.State.values().length];
            try {
                iArr[androidx.work.WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.work.BackoffPolicy.values().length];
            try {
                iArr2[androidx.work.BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[androidx.work.NetworkType.values().length];
            try {
                iArr3[androidx.work.NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.NetworkType.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.NetworkType.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.NetworkType.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[androidx.work.OutOfQuotaPolicy.values().length];
            try {
                iArr4[androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
