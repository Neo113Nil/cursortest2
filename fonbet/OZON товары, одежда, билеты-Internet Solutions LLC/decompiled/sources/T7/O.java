package T7;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class O extends AbstractC4021c {

    /* renamed from: a, reason: collision with root package name */
    private final c f26735a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26736b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26737c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4021c f26738d;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private c f26739a;

        /* renamed from: b, reason: collision with root package name */
        private String f26740b;

        /* renamed from: c, reason: collision with root package name */
        private b f26741c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC4021c f26742d;

        a() {
        }

        public final O a() throws GeneralSecurityException {
            if (this.f26739a == null) {
                this.f26739a = c.f26751c;
            }
            if (this.f26740b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f26741c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            AbstractC4021c abstractC4021c = this.f26742d;
            if (abstractC4021c == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (abstractC4021c.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            b bVar = this.f26741c;
            AbstractC4021c abstractC4021c2 = this.f26742d;
            if ((bVar.equals(b.f26743b) && (abstractC4021c2 instanceof r)) || ((bVar.equals(b.f26745d) && (abstractC4021c2 instanceof C4043z)) || ((bVar.equals(b.f26744c) && (abstractC4021c2 instanceof c0)) || ((bVar.equals(b.f26746e) && (abstractC4021c2 instanceof C4027i)) || ((bVar.equals(b.f26747f) && (abstractC4021c2 instanceof C4032n)) || (bVar.equals(b.f26748g) && (abstractC4021c2 instanceof C4039v))))))) {
                return new O(this.f26739a, this.f26740b, this.f26741c, this.f26742d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f26741c.toString() + " when new keys are picked according to " + this.f26742d + ".");
        }

        public final void b(AbstractC4021c abstractC4021c) {
            this.f26742d = abstractC4021c;
        }

        public final void c(b bVar) {
            this.f26741c = bVar;
        }

        public final void d(String str) {
            this.f26740b = str;
        }

        public final void e(c cVar) {
            this.f26739a = cVar;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26743b = new b("ASSUME_AES_GCM");

        /* renamed from: c, reason: collision with root package name */
        public static final b f26744c = new b("ASSUME_XCHACHA20POLY1305");

        /* renamed from: d, reason: collision with root package name */
        public static final b f26745d = new b("ASSUME_CHACHA20POLY1305");

        /* renamed from: e, reason: collision with root package name */
        public static final b f26746e = new b("ASSUME_AES_CTR_HMAC");

        /* renamed from: f, reason: collision with root package name */
        public static final b f26747f = new b("ASSUME_AES_EAX");

        /* renamed from: g, reason: collision with root package name */
        public static final b f26748g = new b("ASSUME_AES_GCM_SIV");

        /* renamed from: a, reason: collision with root package name */
        private final String f26749a;

        private b(String str) {
            this.f26749a = str;
        }

        public final String toString() {
            return this.f26749a;
        }
    }

    /* loaded from: classes9.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26750b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f26751c = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f26752a;

        private c(String str) {
            this.f26752a = str;
        }

        public final String toString() {
            return this.f26752a;
        }
    }

    O(c cVar, String str, b bVar, AbstractC4021c abstractC4021c) {
        this.f26735a = cVar;
        this.f26736b = str;
        this.f26737c = bVar;
        this.f26738d = abstractC4021c;
    }

    @Override // S7.q
    public final boolean a() {
        return this.f26735a != c.f26751c;
    }

    public final AbstractC4021c b() {
        return this.f26738d;
    }

    public final String c() {
        return this.f26736b;
    }

    public final c d() {
        return this.f26735a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o11 = (O) obj;
        return o11.f26737c.equals(this.f26737c) && o11.f26738d.equals(this.f26738d) && o11.f26736b.equals(this.f26736b) && o11.f26735a.equals(this.f26735a);
    }

    public final int hashCode() {
        return Objects.hash(O.class, this.f26736b, this.f26737c, this.f26738d, this.f26735a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f26736b + ", dekParsingStrategy: " + this.f26737c + ", dekParametersForNewKeys: " + this.f26738d + ", variant: " + this.f26735a + ")";
    }
}
