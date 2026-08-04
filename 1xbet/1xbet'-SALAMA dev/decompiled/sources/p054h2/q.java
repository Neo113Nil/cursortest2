package p054h2;

import A1.X;
import B1.m;
import E1.h;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Map;
import p018c2.V;
import p146u2.r;

/* JADX INFO: loaded from: classes.dex */
public final class q extends V {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Map f13473H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public DrmInitData f13474I;

    public q(r rVar, h hVar, m mVar, Map map) {
        super(rVar, hVar, mVar);
        this.f13473H = map;
    }

    @Override // p018c2.V
    public final X l(X x4) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.f13474I;
        if (drmInitData2 == null) {
            drmInitData2 = x4.f286F;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.f13473H.get(drmInitData2.f10555c)) != null) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = x4.f281A;
        Metadata metadata2 = null;
        if (metadata == null) {
            metadata = metadata2;
        } else {
            Metadata.Entry[] entryArr = metadata.f10562a;
            int length = entryArr.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                }
                Metadata.Entry entry = entryArr[i8];
                if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f10634b)) {
                    break;
                }
                i8++;
            }
            if (i8 != -1) {
                if (length != 1) {
                    Metadata.Entry[] entryArr2 = new Metadata.Entry[length - 1];
                    while (i7 < length) {
                        if (i7 != i8) {
                            entryArr2[i7 < i8 ? i7 : i7 - 1] = entryArr[i7];
                        }
                        i7++;
                    }
                    metadata2 = new Metadata(entryArr2);
                }
                metadata = metadata2;
            }
        }
        if (drmInitData2 != x4.f286F || metadata != x4.f281A) {
            Format$Builder format$BuilderA = x4.a();
            format$BuilderA.f10540n = drmInitData2;
            format$BuilderA.f10536i = metadata;
            x4 = new X(format$BuilderA);
        }
        return super.l(x4);
    }
}
