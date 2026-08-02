package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\u0006À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/Accessor;", "Object", "Field", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "container", "getter", "(Ljava/lang/Object;)Ljava/lang/Object;", "getterNotNull"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Accessor<Object, Field> extends kotlinx.datetime.internal.format.parser.AssignableField<Object, Field> {
    Field getter(Object container);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <Object, Field> Field getterNotNull(kotlinx.datetime.internal.format.Accessor<? super Object, Field> accessor, Object object) {
            return (Field) kotlinx.datetime.internal.format.Accessor.super.getterNotNull(object);
        }
    }

    default Field getterNotNull(Object container) {
        Field field = getter(container);
        if (field != null) {
            return field;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field ");
        sb.append(getName());
        sb.append(" is not set");
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
