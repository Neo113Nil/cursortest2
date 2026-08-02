package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/NetworkType;", "Landroid/net/NetworkRequest;", "toNetworkRequest", "(Landroidx/work/NetworkType;)Landroid/net/NetworkRequest;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkTypeCompatKt {
    public static final android.net.NetworkRequest toNetworkRequest(androidx.work.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        if (networkType == androidx.work.NetworkType.NOT_REQUIRED) {
            return null;
        }
        android.net.NetworkRequest.Builder removeCapability = new android.net.NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
        if (android.os.Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
            return removeCapability.addCapability(25).build();
        }
        int i = androidx.work.impl.utils.NetworkTypeCompatKt.WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i == 1) {
            removeCapability = removeCapability.addTransportType(0);
        } else if (i == 2) {
            removeCapability = removeCapability.addCapability(11);
        } else if (i == 3) {
            removeCapability = removeCapability.addCapability(18);
        }
        return removeCapability.build();
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.work.NetworkType.values().length];
            try {
                iArr[androidx.work.NetworkType.METERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.work.NetworkType.UNMETERED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
