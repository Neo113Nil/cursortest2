package O7;

import Bl0.k0;
import O7.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
abstract class a<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0399a f20011a = EnumC0399a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private String f20012b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: O7.a$a, reason: collision with other inner class name */
    private static final class EnumC0399a {
        private static final /* synthetic */ EnumC0399a[] $VALUES;
        public static final EnumC0399a DONE;
        public static final EnumC0399a FAILED;
        public static final EnumC0399a NOT_READY;
        public static final EnumC0399a READY;

        static {
            EnumC0399a enumC0399a = new EnumC0399a("READY", 0);
            READY = enumC0399a;
            EnumC0399a enumC0399a2 = new EnumC0399a("NOT_READY", 1);
            NOT_READY = enumC0399a2;
            EnumC0399a enumC0399a3 = new EnumC0399a("DONE", 2);
            DONE = enumC0399a3;
            EnumC0399a enumC0399a4 = new EnumC0399a("FAILED", 3);
            FAILED = enumC0399a4;
            $VALUES = new EnumC0399a[]{enumC0399a, enumC0399a2, enumC0399a3, enumC0399a4};
        }

        private EnumC0399a() {
            throw null;
        }

        public static EnumC0399a valueOf(String str) {
            return (EnumC0399a) Enum.valueOf(EnumC0399a.class, str);
        }

        public static EnumC0399a[] values() {
            return (EnumC0399a[]) $VALUES.clone();
        }
    }

    protected a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r8 = r0.f20034g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if (r8 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        r4 = r6.length();
        r0.f20033f = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r4 <= r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        if (r7.a(r6.charAt(r4 - 1)) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        r0 = r6.subSequence(r1, r4).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ac, code lost:
    
        r0.f20034g = r8 - 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasNext() {
        String str;
        c cVar;
        EnumC0399a enumC0399a = this.f20011a;
        EnumC0399a enumC0399a2 = EnumC0399a.FAILED;
        k0.m(enumC0399a != enumC0399a2);
        int ordinal = this.f20011a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.f20011a = enumC0399a2;
            m.a aVar = (m.a) this;
            int i11 = aVar.f20033f;
            while (true) {
                int i12 = aVar.f20033f;
                if (i12 == -1) {
                    aVar.f20011a = EnumC0399a.DONE;
                    str = null;
                    break;
                }
                k kVar = (k) aVar;
                c cVar2 = kVar.f20025h.f20026a;
                CharSequence charSequence = kVar.f20030c;
                int length = charSequence.length();
                k0.h(i12, length);
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    }
                    if (cVar2.a(charSequence.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                CharSequence charSequence2 = aVar.f20030c;
                if (i12 == -1) {
                    i12 = charSequence2.length();
                    aVar.f20033f = -1;
                } else {
                    aVar.f20033f = i12 + 1;
                }
                int i13 = aVar.f20033f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    aVar.f20033f = i14;
                    if (i14 > charSequence2.length()) {
                        aVar.f20033f = -1;
                    }
                } else {
                    while (true) {
                        cVar = aVar.f20031d;
                        if (i11 >= i12 || !cVar.a(charSequence2.charAt(i11))) {
                            break;
                        }
                        i11++;
                    }
                    while (i12 > i11 && cVar.a(charSequence2.charAt(i12 - 1))) {
                        i12--;
                    }
                    if (!aVar.f20032e || i11 != i12) {
                        break;
                    }
                    i11 = aVar.f20033f;
                }
            }
            this.f20012b = str;
            if (this.f20011a != EnumC0399a.DONE) {
                this.f20011a = EnumC0399a.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20011a = EnumC0399a.NOT_READY;
        T t2 = (T) this.f20012b;
        this.f20012b = null;
        return t2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
