package R1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import w2.C1772g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1772g f5879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5880c;

    public /* synthetic */ a(k kVar, C1772g c1772g, int i7) {
        this.f5878a = i7;
        this.f5880c = kVar;
        this.f5879b = c1772g;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j3) {
        switch (this.f5878a) {
            case 0:
                ((b) this.f5880c).getClass();
                C1772g c1772g = this.f5879b;
                c1772g.getClass();
                if (v2.t.f17153a < 30) {
                    Handler handler = c1772g.f17978a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    w2.h hVar = c1772g.f17979b;
                    if (c1772g == hVar.f17985C1) {
                        if (j == Long.MAX_VALUE) {
                            hVar.f5964O0 = true;
                            break;
                        } else {
                            try {
                                hVar.p0(j);
                                hVar.x0();
                                hVar.f5968Q0.f1689e++;
                                hVar.w0();
                                hVar.Z(j);
                                break;
                            } catch (A1.r e7) {
                                hVar.f5966P0 = e7;
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                ((android.support.v4.media.session.t) this.f5880c).getClass();
                C1772g c1772g2 = this.f5879b;
                c1772g2.getClass();
                if (v2.t.f17153a < 30) {
                    Handler handler2 = c1772g2.f17978a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                } else {
                    w2.h hVar2 = c1772g2.f17979b;
                    if (c1772g2 == hVar2.f17985C1) {
                        if (j == Long.MAX_VALUE) {
                            hVar2.f5964O0 = true;
                            break;
                        } else {
                            try {
                                hVar2.p0(j);
                                hVar2.x0();
                                hVar2.f5968Q0.f1689e++;
                                hVar2.w0();
                                hVar2.Z(j);
                                break;
                            } catch (A1.r e8) {
                                hVar2.f5966P0 = e8;
                            }
                        }
                    }
                }
                break;
        }
    }
}
