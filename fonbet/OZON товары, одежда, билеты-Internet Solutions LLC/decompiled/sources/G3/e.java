package G3;

import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f9682a = new a();

    final class a implements e {
        @Override // G3.e
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // G3.e
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // G3.e
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
