package h2;

import A1.X;
import c2.V;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Map;

/* renamed from: h2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195q extends V {

    /* renamed from: H, reason: collision with root package name */
    public final Map f13467H;

    /* renamed from: I, reason: collision with root package name */
    public DrmInitData f13468I;

    public C1195q(u2.r rVar, E1.h hVar, B1.m mVar, Map map) {
        super(rVar, hVar, mVar);
        this.f13467H = map;
    }

    @Override // c2.V
    public final X l(X x4) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.f13468I;
        if (drmInitData2 == null) {
            drmInitData2 = x4.f286F;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.f13467H.get(drmInitData2.f10555c)) != null) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = x4.f281A;
        Metadata metadata2 = null;
        if (metadata != null) {
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
            }
            if (drmInitData2 == x4.f286F || metadata != x4.f281A) {
                Format$Builder a2 = x4.a();
                a2.f10540n = drmInitData2;
                a2.f10536i = metadata;
                x4 = new X(a2);
            }
            return super.l(x4);
        }
        metadata = metadata2;
        if (drmInitData2 == x4.f286F) {
        }
        Format$Builder a22 = x4.a();
        a22.f10540n = drmInitData2;
        a22.f10536i = metadata;
        x4 = new X(a22);
        return super.l(x4);
    }
}
