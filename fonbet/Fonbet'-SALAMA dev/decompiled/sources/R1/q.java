package R1;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final q f6006b = new q(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6007a;

    public /* synthetic */ q(int i7) {
        this.f6007a = i7;
    }

    @Override // R1.v
    public int a(Object obj) {
        m mVar = (m) obj;
        switch (this.f6007a) {
            case 1:
                String str = mVar.f5925a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (v2.t.f17153a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return mVar.f5925a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
