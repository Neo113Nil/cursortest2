package kotlinx.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000fB+\b\u0017\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0012B\u0011\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;Ljava/lang/String;)V", "missingFields", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "cause", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "newMessage", "withNewMessageInternal$kotlinx_serialization_core", "(Ljava/lang/String;)Lkotlinx/serialization/MissingFieldException;", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public final class MissingFieldException extends kotlinx.serialization.SerializationException {
    private final java.util.List<java.lang.String> missingFields;
    private final java.lang.String serialName;

    private MissingFieldException(java.lang.String str, java.lang.Throwable th, java.util.List<java.lang.String> list, java.lang.String str2) {
        super(str, th);
        this.missingFields = list;
        this.serialName = str2;
    }

    public final java.util.List<java.lang.String> getMissingFields() {
        return this.missingFields;
    }

    public final java.lang.String getSerialName() {
        return this.serialName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(java.util.List<java.lang.String> list, java.lang.String str) {
        this(r0, null, list, str);
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (list.size() == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Field '");
            sb.append(list.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str);
            sb.append("', but it was missing");
            obj = sb.toString();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Fields ");
            sb2.append(list);
            sb2.append(" are required for type with serial name '");
            sb2.append(str);
            sb2.append("', but they were missing");
            obj = sb2.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(java.lang.String str, java.lang.String str2) {
        this(r1.toString(), null, r0, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field '");
        sb.append(str);
        sb.append("' is required for type with serial name '");
        sb.append(str2);
        sb.append("', but it was missing");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use constructor which accepts serialName parameter", replaceWith = @kotlin.ReplaceWith(expression = "MissingFieldException(missingFields, descriptor.serialName, message, cause)", imports = {}))
    public MissingFieldException(java.util.List<java.lang.String> list, java.lang.String str, java.lang.Throwable th) {
        this(str, th, list, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Constructor used by the serializers generated by plugins older than Kotlin 1.5")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MissingFieldException(java.lang.String str) {
        this(r0.toString(), null, kotlin.collections.CollectionsKt.listOf(str), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field '");
        sb.append(str);
        sb.append("' is required, but it was missing");
    }

    public final kotlinx.serialization.MissingFieldException withNewMessageInternal$kotlinx_serialization_core(java.lang.String newMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newMessage, "");
        return new kotlinx.serialization.MissingFieldException(newMessage, this, this.missingFields, this.serialName);
    }
}
