package bd;

import gd.InterfaceC6712a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class n implements Sequence<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BufferedReader f55951a;

    public static final class a implements Iterator<String>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private String f55952a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55953b;

        a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f55952a == null && !this.f55953b) {
                String readLine = n.this.f55951a.readLine();
                this.f55952a = readLine;
                if (readLine == null) {
                    this.f55953b = true;
                }
            }
            return this.f55952a != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f55952a;
            this.f55952a = null;
            Intrinsics.f(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f55951a = reader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<String> iterator() {
        return new a();
    }
}
