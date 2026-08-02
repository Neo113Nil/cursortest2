package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001$B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u00112\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/navigation/serialization/RouteBuilder;", "T", "", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "path", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)V", "build", "()Ljava/lang/String;", "p0", "p1", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "name", "Landroidx/navigation/NavType;", "type", "appendPattern", "(ILjava/lang/String;Landroidx/navigation/NavType;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "appendArg", "(ILjava/lang/String;Landroidx/navigation/NavType;Ljava/util/List;)V", "Landroidx/navigation/serialization/RouteBuilder$ParamType;", "getHighSpeedVideoFpsRangesFor", "(ILandroidx/navigation/NavType;)Landroidx/navigation/serialization/RouteBuilder$ParamType;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/KSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "ParamType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RouteBuilder<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public RouteBuilder(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighSpeedVideoSizes = "";
        this.getHighSpeedVideoFpsRangesFor = "";
        this.getHighResolutionOutputSizeshNQ4ISI = kSerializer;
        this.Camera2StreamConfigurationMap = kSerializer.getDescriptor().getGetHighSpeedVideoSizes();
    }

    public RouteBuilder(java.lang.String str, kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighSpeedVideoSizes = "";
        this.getHighSpeedVideoFpsRangesFor = "";
        this.getHighResolutionOutputSizeshNQ4ISI = kSerializer;
        this.Camera2StreamConfigurationMap = str;
    }

    public final java.lang.String build() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    private final void getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1) {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor.length() == 0 ? com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION : "&";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(str);
        sb.append(p0);
        sb.append('=');
        sb.append(p1);
        this.getHighSpeedVideoFpsRangesFor = sb.toString();
    }

    public final void appendPattern(int index, java.lang.String name2, androidx.view.NavType<java.lang.Object> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        int i = androidx.navigation.serialization.RouteBuilder.WhenMappings.$EnumSwitchMapping$0[getHighSpeedVideoFpsRangesFor(index, type).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            sb.append(name2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            getHighSpeedVideoSizes(name2, sb.toString());
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{");
        sb2.append(name2);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(this.getHighSpeedVideoSizes);
        sb3.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb3.append(obj);
        this.getHighSpeedVideoSizes = sb3.toString();
    }

    public final void appendArg(int index, java.lang.String name2, androidx.view.NavType<java.lang.Object> type, java.util.List<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        int i = androidx.navigation.serialization.RouteBuilder.WhenMappings.$EnumSwitchMapping$0[getHighSpeedVideoFpsRangesFor(index, type).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes(name2, (java.lang.String) it.next());
            }
            return;
        }
        if (value.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected one value for argument ");
            sb.append(name2);
            sb.append(", found ");
            sb.append(value.size());
            sb.append("values instead.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) value);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.getHighSpeedVideoSizes);
        sb2.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb2.append(str);
        this.getHighSpeedVideoSizes = sb2.toString();
    }

    private final androidx.navigation.serialization.RouteBuilder.ParamType getHighSpeedVideoFpsRangesFor(int p0, androidx.view.NavType<java.lang.Object> p1) {
        if ((p1 instanceof androidx.view.CollectionNavType) || this.getHighResolutionOutputSizeshNQ4ISI.getDescriptor().isElementOptional(p0)) {
            return androidx.navigation.serialization.RouteBuilder.ParamType.getHighSpeedVideoSizes;
        }
        return androidx.navigation.serialization.RouteBuilder.ParamType.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ParamType {
        public static final androidx.navigation.serialization.RouteBuilder.ParamType getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.navigation.serialization.RouteBuilder.ParamType[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        public static final androidx.navigation.serialization.RouteBuilder.ParamType getHighSpeedVideoSizes;

        private ParamType(java.lang.String str, int i) {
        }

        static {
            androidx.navigation.serialization.RouteBuilder.ParamType paramType = new androidx.navigation.serialization.RouteBuilder.ParamType("PATH", 0);
            getHighResolutionOutputSizeshNQ4ISI = paramType;
            androidx.navigation.serialization.RouteBuilder.ParamType paramType2 = new androidx.navigation.serialization.RouteBuilder.ParamType("QUERY", 1);
            getHighSpeedVideoSizes = paramType2;
            androidx.navigation.serialization.RouteBuilder.ParamType[] paramTypeArr = {paramType, paramType2};
            getHighSpeedVideoFpsRanges = paramTypeArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paramTypeArr);
        }

        public static androidx.navigation.serialization.RouteBuilder.ParamType valueOf(java.lang.String str) {
            return (androidx.navigation.serialization.RouteBuilder.ParamType) java.lang.Enum.valueOf(androidx.navigation.serialization.RouteBuilder.ParamType.class, str);
        }

        public static androidx.navigation.serialization.RouteBuilder.ParamType[] values() {
            return (androidx.navigation.serialization.RouteBuilder.ParamType[]) getHighSpeedVideoFpsRanges.clone();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.navigation.serialization.RouteBuilder.ParamType.values().length];
            try {
                iArr[androidx.navigation.serialization.RouteBuilder.ParamType.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.navigation.serialization.RouteBuilder.ParamType.getHighSpeedVideoSizes.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
