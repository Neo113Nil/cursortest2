package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import okio.RealBufferedSource;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class c9 implements Function2 {
    public final /* synthetic */ Ref.ObjectRef Uo5pffGf8LUU;
    public final /* synthetic */ Ref.ObjectRef b41X89IqSbKt;
    public final /* synthetic */ RealBufferedSource gmXBnHsR2YSm;
    public final /* synthetic */ Ref.ObjectRef i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ c9(Ref.ObjectRef objectRef, RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.b41X89IqSbKt = objectRef;
        this.gmXBnHsR2YSm = realBufferedSource;
        this.i7xAcZoXXiIt = objectRef2;
        this.Uo5pffGf8LUU = objectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Ref.ObjectRef objectRef = this.Uo5pffGf8LUU;
        Ref.ObjectRef objectRef2 = this.i7xAcZoXXiIt;
        RealBufferedSource realBufferedSource = this.gmXBnHsR2YSm;
        Ref.ObjectRef objectRef3 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue >= 1) {
                        byte readByte = realBufferedSource.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                objectRef3.oyjLVtGms9eZwJ0 = Integer.valueOf(realBufferedSource.hRNgd2zGCE5kj());
                            }
                            if (z2) {
                                objectRef2.oyjLVtGms9eZwJ0 = Integer.valueOf(realBufferedSource.hRNgd2zGCE5kj());
                            }
                            if (z3) {
                                objectRef.oyjLVtGms9eZwJ0 = Integer.valueOf(realBufferedSource.hRNgd2zGCE5kj());
                                break;
                            }
                        } else {
                            h1.i7xAcZoXXiIt("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        h1.i7xAcZoXXiIt("bad zip: extended timestamp extra too short");
                    }
                    break;
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (objectRef3.oyjLVtGms9eZwJ0 != null) {
                        h1.i7xAcZoXXiIt("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (longValue2 == 24) {
                        objectRef3.oyjLVtGms9eZwJ0 = Long.valueOf(realBufferedSource.MRfxZSx8l5UG62U());
                        objectRef2.oyjLVtGms9eZwJ0 = Long.valueOf(realBufferedSource.MRfxZSx8l5UG62U());
                        objectRef.oyjLVtGms9eZwJ0 = Long.valueOf(realBufferedSource.MRfxZSx8l5UG62U());
                        break;
                    } else {
                        h1.i7xAcZoXXiIt("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    break;
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ c9(RealBufferedSource realBufferedSource, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.gmXBnHsR2YSm = realBufferedSource;
        this.b41X89IqSbKt = objectRef;
        this.i7xAcZoXXiIt = objectRef2;
        this.Uo5pffGf8LUU = objectRef3;
    }
}
