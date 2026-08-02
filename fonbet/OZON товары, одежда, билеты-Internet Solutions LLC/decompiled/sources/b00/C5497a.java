package b00;

import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lb00/a;", "", "Ll10/i;", "container", "b", "(Ll10/i;)Ll10/i;", "", "size", "lastItemOffset", "", "f", "(Ll10/i;II)V", "", "h", "(Ll10/i;)Ljava/lang/String;", "e", "(Ll10/i;)I", "other", "", "c", "(Ll10/i;Ljava/lang/Object;)Z", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b00.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5497a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i f45586a;

    private /* synthetic */ C5497a(i iVar) {
        this.f45586a = iVar;
    }

    public static final /* synthetic */ C5497a a(i iVar) {
        return new C5497a(iVar);
    }

    @NotNull
    public static i b(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container;
    }

    public static boolean c(i iVar, Object obj) {
        return (obj instanceof C5497a) && Intrinsics.d(iVar, ((C5497a) obj).getF45586a());
    }

    public static final boolean d(i iVar, i iVar2) {
        return Intrinsics.d(iVar, iVar2);
    }

    public static int e(i iVar) {
        return iVar.hashCode();
    }

    public static final void f(i iVar, int i11, int i12) {
        iVar.k0(i11, i12);
    }

    public static /* synthetic */ void g(i iVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = i11;
        }
        f(iVar, i11, i12);
    }

    public static String h(i iVar) {
        return "ComposerComposeContainer(container=" + iVar + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f45586a, obj);
    }

    public int hashCode() {
        return e(this.f45586a);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ i getF45586a() {
        return this.f45586a;
    }

    public String toString() {
        return h(this.f45586a);
    }
}
