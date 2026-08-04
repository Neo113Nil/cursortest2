package R1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p156w2.g f5879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5880c;

    public /* synthetic */ a(k kVar, p156w2.g gVar, int i7) {
        this.f5878a = i7;
        this.f5880c = kVar;
        this.f5879b = gVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j3) {
        switch (this.f5878a) {
            case 0:
                ((b) this.f5880c).getClass();
                p156w2.g gVar = this.f5879b;
                gVar.getClass();
                if (p151v2.t.f17159a < 30) {
                    Handler handler = gVar.f17984a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    p156w2.h hVar = gVar.f17985b;
                    if (gVar == hVar.f17991C1) {
                        if (j == Long.MAX_VALUE) {
                            hVar.f5964O0 = true;
                        } else {
                            try {
                                hVar.p0(j);
                                hVar.x0();
                                hVar.f5968Q0.f1689e++;
                                hVar.w0();
                                hVar.Z(j);
                            } catch (A1.r e7) {
                                hVar.f5966P0 = e7;
                                return;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                ((android.support.v4.media.session.t) this.f5880c).getClass();
                p156w2.g gVar2 = this.f5879b;
                gVar2.getClass();
                if (p151v2.t.f17159a < 30) {
                    Handler handler2 = gVar2.f17984a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    p156w2.h hVar2 = gVar2.f17985b;
                    if (gVar2 == hVar2.f17991C1) {
                        if (j == Long.MAX_VALUE) {
                            hVar2.f5964O0 = true;
                        } else {
                            try {
                                hVar2.p0(j);
                                hVar2.x0();
                                hVar2.f5968Q0.f1689e++;
                                hVar2.w0();
                                hVar2.Z(j);
                            } catch (A1.r e8) {
                                hVar2.f5966P0 = e8;
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
