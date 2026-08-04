package F1;

import A1.C0045t0;
import C1.C0095a;
import android.util.Base64;
import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static int a(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    public static Metadata b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = p151v2.t.f17159a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new C0095a(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    p151v2.a.G(e7, "VorbisUtil", "Failed to parse vorbis picture");
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static C1052y0 c(C0095a c0095a, boolean z4, boolean z7) throws C0045t0 {
        if (z4) {
            d(3, c0095a, false);
        }
        c0095a.r((int) c0095a.k(), D3.f.f1719c);
        long jK = c0095a.k();
        String[] strArr = new String[(int) jK];
        for (int i7 = 0; i7 < jK; i7++) {
            strArr[i7] = c0095a.r((int) c0095a.k(), D3.f.f1719c);
        }
        if (z7 && (c0095a.t() & 1) == 0) {
            throw C0045t0.a(null, "framing bit expected to be set");
        }
        return new C1052y0(strArr, 3);
    }

    public static boolean d(int i7, C0095a c0095a, boolean z4) throws C0045t0 {
        if (c0095a.d() < 7) {
            if (z4) {
                return false;
            }
            throw C0045t0.a(null, "too short header: " + c0095a.d());
        }
        if (c0095a.t() != i7) {
            if (z4) {
                return false;
            }
            throw C0045t0.a(null, "expected header type " + Integer.toHexString(i7));
        }
        if (c0095a.t() == 118 && c0095a.t() == 111 && c0095a.t() == 114 && c0095a.t() == 98 && c0095a.t() == 105 && c0095a.t() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw C0045t0.a(null, "expected characters 'vorbis'");
    }
}
