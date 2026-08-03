package F;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i2, java.lang.Object obj) {
        super(0);
        this.f398e = i2;
        this.f399f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.j, s1.a] */
    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        java.lang.String substring;
        switch (this.f398e) {
            case 0:
                java.lang.Object obj = F.V.f401d;
                java.io.File file = (java.io.File) this.f399f;
                synchronized (obj) {
                    F.V.f400c.remove(file.getAbsolutePath());
                }
                return h1.C0177i.f3302a;
            case 1:
                java.io.File file2 = (java.io.File) ((H.b) this.f399f).invoke();
                java.lang.String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                int U2 = y1.g.U(name, '.', 0, 6);
                if (U2 == -1) {
                    substring = "";
                } else {
                    substring = name.substring(U2 + 1, name.length());
                    kotlin.jvm.internal.i.d(substring, "substring(...)");
                }
                if (substring.equals("preferences_pb")) {
                    java.io.File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new java.lang.IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return (java.util.List) this.f399f;
            case 3:
                try {
                    return (java.util.List) ((kotlin.jvm.internal.j) this.f399f).invoke();
                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                    return i1.C0199r.f3325a;
                }
            case 4:
                I1.k kVar = ((M1.k) this.f399f).f1072e;
                kotlin.jvm.internal.i.b(kVar);
                java.util.List a2 = kVar.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(a2));
                java.util.Iterator it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.security.cert.X509Certificate) ((java.security.cert.Certificate) it.next()));
                }
                return arrayList;
            case 5:
                W.i iVar = (W.i) this.f399f;
                return java.math.BigInteger.valueOf(iVar.f1822a).shiftLeft(32).or(java.math.BigInteger.valueOf(iVar.f1823b)).shiftLeft(32).or(java.math.BigInteger.valueOf(iVar.f1824c));
            default:
                ((K.e) this.f399f).getClass();
                throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U(s1.InterfaceC0991a interfaceC0991a) {
        super(0);
        this.f398e = 3;
        this.f399f = (kotlin.jvm.internal.j) interfaceC0991a;
    }
}
