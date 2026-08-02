package R2;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L<T> implements h0<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f24293d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f24294e = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2.h f24295a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<File, U> f24296b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<File> f24297c;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f24298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file) {
            super(0);
            this.f24298b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object obj = L.f24294e;
            File file = this.f24298b;
            synchronized (obj) {
                L.f24293d.remove(file.getAbsolutePath());
            }
            return Unit.f71690a;
        }
    }

    public L(Function0 produceFile) {
        W2.h serializer = W2.h.f33210a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        K coordinatorProducer = K.f24292b;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f24295a = serializer;
        this.f24296b = coordinatorProducer;
        this.f24297c = produceFile;
    }

    @Override // R2.h0
    @NotNull
    public final i0<T> a() {
        File file = this.f24297c.invoke().getCanonicalFile();
        synchronized (f24294e) {
            String path = file.getAbsolutePath();
            LinkedHashSet linkedHashSet = f24293d;
            if (linkedHashSet.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            linkedHashSet.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new O(file, this.f24295a, this.f24296b.invoke(file), new a(file));
    }
}
