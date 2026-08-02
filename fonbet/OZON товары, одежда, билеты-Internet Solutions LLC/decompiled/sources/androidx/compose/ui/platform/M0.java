package androidx.compose.ui.platform;

import Sc.C;
import android.os.Parcel;
import android.util.Base64;
import java.util.List;
import kotlin.collections.C7714v;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Parcel f40722a;

    public M0(@NotNull String str) {
        Parcel obtain = Parcel.obtain();
        this.f40722a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0084, code lost:
    
        if (r2 == 2) goto L41;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final K1.D a() {
        V1.i iVar;
        V1.i iVar2;
        V1.i iVar3;
        V1.i iVar4;
        V1.i iVar5;
        C5263l1 c5263l1 = new C5263l1();
        while (true) {
            Parcel parcel = this.f40722a;
            if (parcel.dataAvail() > 1) {
                byte readByte = parcel.readByte();
                if (readByte != 1) {
                    int i11 = 2;
                    if (readByte != 2) {
                        if (readByte != 3) {
                            int i12 = 0;
                            if (readByte != 4) {
                                if (readByte != 5) {
                                    if (readByte != 6) {
                                        if (readByte != 7) {
                                            if (readByte != 8) {
                                                if (readByte != 9) {
                                                    if (readByte != 10) {
                                                        if (readByte != 11) {
                                                            if (readByte == 12) {
                                                                if (parcel.dataAvail() < 20) {
                                                                    break;
                                                                }
                                                                long readLong = parcel.readLong();
                                                                C.Companion companion = Sc.C.INSTANCE;
                                                                int i13 = C7807Z.f72260n;
                                                                c5263l1.j(new l1.H0(readLong, P9.a.a(parcel.readFloat(), parcel.readFloat()), parcel.readFloat()));
                                                            } else {
                                                                continue;
                                                            }
                                                        } else {
                                                            if (parcel.dataAvail() < 4) {
                                                                break;
                                                            }
                                                            int readInt = parcel.readInt();
                                                            iVar = V1.i.f27917d;
                                                            boolean z11 = (iVar.e() & readInt) != 0;
                                                            iVar2 = V1.i.f27916c;
                                                            boolean z12 = (readInt & iVar2.e()) != 0;
                                                            if (z11 && z12) {
                                                                iVar4 = V1.i.f27917d;
                                                                iVar5 = V1.i.f27916c;
                                                                List b02 = C7714v.b0(iVar4, iVar5);
                                                                Integer num = 0;
                                                                int size = b02.size();
                                                                while (i12 < size) {
                                                                    num = Integer.valueOf(num.intValue() | ((V1.i) b02.get(i12)).e());
                                                                    i12++;
                                                                }
                                                                iVar3 = new V1.i(num.intValue());
                                                            } else {
                                                                iVar3 = z11 ? V1.i.f27917d : z12 ? V1.i.f27916c : V1.i.f27915b;
                                                            }
                                                            c5263l1.k(iVar3);
                                                        }
                                                    } else {
                                                        if (parcel.dataAvail() < 8) {
                                                            break;
                                                        }
                                                        long readLong2 = parcel.readLong();
                                                        C.Companion companion2 = Sc.C.INSTANCE;
                                                        int i14 = C7807Z.f72260n;
                                                        c5263l1.a(readLong2);
                                                    }
                                                } else {
                                                    if (parcel.dataAvail() < 8) {
                                                        break;
                                                    }
                                                    c5263l1.l(new V1.m(parcel.readFloat(), parcel.readFloat()));
                                                }
                                            } else {
                                                if (parcel.dataAvail() < 4) {
                                                    break;
                                                }
                                                c5263l1.b(V1.a.a(parcel.readFloat()));
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            c5263l1.i(b());
                                        }
                                    } else {
                                        c5263l1.d(parcel.readString());
                                    }
                                } else {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    byte readByte2 = parcel.readByte();
                                    if (readByte2 != 0) {
                                        if (readByte2 == 1) {
                                            i11 = 1;
                                        } else if (readByte2 == 3) {
                                            i11 = 3;
                                        }
                                        c5263l1.g(P1.B.a(i11));
                                    }
                                    i11 = 0;
                                    c5263l1.g(P1.B.a(i11));
                                }
                            } else {
                                if (parcel.dataAvail() < 1) {
                                    break;
                                }
                                byte readByte3 = parcel.readByte();
                                if (readByte3 != 0 && readByte3 == 1) {
                                    i12 = 1;
                                }
                                c5263l1.f(P1.A.a(i12));
                            }
                        } else {
                            if (parcel.dataAvail() < 4) {
                                break;
                            }
                            c5263l1.h(new P1.F(parcel.readInt()));
                        }
                    } else {
                        if (parcel.dataAvail() < 5) {
                            break;
                        }
                        c5263l1.e(b());
                    }
                } else {
                    if (parcel.dataAvail() < 8) {
                        break;
                    }
                    long readLong3 = parcel.readLong();
                    C.Companion companion3 = Sc.C.INSTANCE;
                    int i15 = C7807Z.f72260n;
                    c5263l1.c(readLong3);
                }
            } else {
                break;
            }
        }
        return c5263l1.m();
    }

    public final long b() {
        long j11;
        Parcel parcel = this.f40722a;
        byte readByte = parcel.readByte();
        long j12 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        if (!Z1.v.b(j12, 0L)) {
            return Hj0.T.f(parcel.readFloat(), j12);
        }
        j11 = Z1.u.f35334c;
        return j11;
    }
}
