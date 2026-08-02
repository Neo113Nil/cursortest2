package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/tooling/SourceInformation;", "", "", "isCall", "isInline", "", "functionName", "sourceFile", "", "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "parameters", "packageHash", "Landroidx/compose/runtime/tooling/LocationSourceInformation;", "locations", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Z", "()Z", "Ljava/lang/String;", "getFunctionName", "()Ljava/lang/String;", "getSourceFile", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "getPackageHash", "getLocations", "getRawData"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceInformation {
    public static final int $stable = 8;
    private final java.lang.String functionName;
    private final boolean isCall;
    private final boolean isInline;
    private final java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> locations;
    private final java.lang.String packageHash;
    private final java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> parameters;
    private final java.lang.String rawData;
    private final java.lang.String sourceFile;

    public SourceInformation(boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> list, java.lang.String str3, java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> list2, java.lang.String str4) {
        this.isCall = z;
        this.isInline = z2;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
        this.rawData = str4;
    }

    /* renamed from: isCall, reason: from getter */
    public final boolean getIsCall() {
        return this.isCall;
    }

    /* renamed from: isInline, reason: from getter */
    public final boolean getIsInline() {
        return this.isInline;
    }

    public final java.lang.String getFunctionName() {
        return this.functionName;
    }

    public final java.lang.String getSourceFile() {
        return this.sourceFile;
    }

    public final java.util.List<androidx.compose.runtime.tooling.ParameterSourceInformation> getParameters() {
        return this.parameters;
    }

    public final java.lang.String getPackageHash() {
        return this.packageHash;
    }

    public final java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> getLocations() {
        return this.locations;
    }

    public final java.lang.String getRawData() {
        return this.rawData;
    }
}
