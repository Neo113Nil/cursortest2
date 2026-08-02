package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u000fR\u001a\u0010\u0004\u001a\u00020\u00038'X¦\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00038'X¦\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0007\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/reflect/KProperty;", "V", "Lkotlin/reflect/KCallable;", "", "isLateinit", "()Z", "isLateinit$annotations", "()V", "isConst", "isConst$annotations", "Lkotlin/reflect/KProperty$Getter;", "getGetter", "()Lkotlin/reflect/KProperty$Getter;", "getter", "Accessor", "Getter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface KProperty<V> extends kotlin.reflect.KCallable<V> {

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/KProperty$Accessor;", "V", "", "Lkotlin/reflect/KProperty;", "getProperty", "()Lkotlin/reflect/KProperty;", "property"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface Accessor<V> {
        kotlin.reflect.KProperty<V> getProperty();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void isConst$annotations() {
        }

        public static /* synthetic */ void isLateinit$annotations() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003"}, d2 = {"Lkotlin/reflect/KProperty$Getter;", "V", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface Getter<V> extends kotlin.reflect.KProperty.Accessor<V>, kotlin.reflect.KFunction<V> {
    }

    kotlin.reflect.KProperty.Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
