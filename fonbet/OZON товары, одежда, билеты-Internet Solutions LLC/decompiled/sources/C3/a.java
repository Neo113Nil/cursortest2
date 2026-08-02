package C3;

import a4.C4939a;
import b4.C5531g;
import d4.C6078c;
import j3.C7272n;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4380a = new C0107a();

    /* renamed from: C3.a$a, reason: collision with other inner class name */
    final class C0107a implements a {
        public final W3.b a(C7272n c7272n) {
            String str = c7272n.f69127o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new X3.b();
                    case "application/x-icy":
                        return new C4939a();
                    case "application/id3":
                        return new C5531g();
                    case "application/x-emsg":
                        return new Y3.b();
                    case "application/x-scte35":
                        return new C6078c();
                }
            }
            throw new IllegalArgumentException(Nk.a.b("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(C7272n c7272n) {
            String str = c7272n.f69127o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
