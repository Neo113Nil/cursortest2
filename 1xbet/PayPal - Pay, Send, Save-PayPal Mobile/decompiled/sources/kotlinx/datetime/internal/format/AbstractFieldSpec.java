package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/datetime/internal/format/AbstractFieldSpec;", "Target", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE, "Lkotlinx/datetime/internal/format/FieldSpec;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AbstractFieldSpec<Target, Type> implements kotlinx.datetime.internal.format.FieldSpec<Target, Type> {
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The field ");
        sb.append(getName());
        sb.append(" (default value is ");
        sb.append(getDefaultValue());
        sb.append(')');
        return sb.toString();
    }
}
