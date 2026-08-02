package o2;

import R1.l;
import a3.AbstractC0467k;
import android.os.Build;
import f2.C1945c;
import f2.C1946d;
import f2.C1947e;
import f2.C1948f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(R1.h hVar, int i) {
        super(hVar);
        this.f18622d = i;
    }

    @Override // R1.l
    public final String b() {
        switch (this.f18622d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0211  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01ed -> B:68:0x0205). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Y1.f fVar, Object obj) {
        int i;
        int i5;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        HashSet hashSet;
        switch (this.f18622d) {
            case 0:
                C2219a c2219a = (C2219a) obj;
                String str = c2219a.f18620a;
                if (str == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str, 1);
                }
                String str2 = c2219a.f18621b;
                if (str2 == null) {
                    fVar.h(2);
                    return;
                } else {
                    fVar.i(str2, 2);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str3 = cVar.f18623a;
                if (str3 == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str3, 1);
                }
                Long l5 = cVar.f18624b;
                if (l5 == null) {
                    fVar.h(2);
                    return;
                } else {
                    fVar.f(2, l5.longValue());
                    return;
                }
            case 2:
                String str4 = ((d) obj).f18625a;
                if (str4 == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str4, 1);
                }
                fVar.f(2, r0.f18626b);
                return;
            case 3:
                f fVar2 = (f) obj;
                fVar2.getClass();
                fVar.h(1);
                String str5 = fVar2.f18628a;
                if (str5 == null) {
                    fVar.h(2);
                    return;
                } else {
                    fVar.i(str5, 2);
                    return;
                }
            case 4:
                g gVar = (g) obj;
                String str6 = gVar.f18629a;
                if (str6 == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str6, 1);
                }
                byte[] c5 = C1948f.c(gVar.f18630b);
                if (c5 == null) {
                    fVar.h(2);
                    return;
                } else {
                    fVar.d(2, c5);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f18633a;
                int i6 = 1;
                if (str7 == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str7, 1);
                }
                fVar.f(2, N4.b.Y(iVar.f18634b));
                String str8 = iVar.f18635c;
                if (str8 == null) {
                    fVar.h(3);
                } else {
                    fVar.i(str8, 3);
                }
                String str9 = iVar.f18636d;
                if (str9 == null) {
                    fVar.h(4);
                } else {
                    fVar.i(str9, 4);
                }
                byte[] c6 = C1948f.c(iVar.f18637e);
                if (c6 == null) {
                    fVar.h(5);
                } else {
                    fVar.d(5, c6);
                }
                byte[] c7 = C1948f.c(iVar.f);
                if (c7 == null) {
                    fVar.h(6);
                } else {
                    fVar.d(6, c7);
                }
                fVar.f(7, iVar.f18638g);
                fVar.f(8, iVar.f18639h);
                fVar.f(9, iVar.i);
                fVar.f(10, iVar.f18641k);
                int i7 = iVar.f18642l;
                int b3 = AbstractC2462i.b(i7);
                if (b3 == 0) {
                    i = 0;
                } else {
                    if (b3 != 1) {
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(i7 != 1 ? i7 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i = 1;
                }
                fVar.f(11, i);
                fVar.f(12, iVar.f18643m);
                fVar.f(13, iVar.f18644n);
                fVar.f(14, iVar.f18645o);
                fVar.f(15, iVar.f18646p);
                fVar.f(16, iVar.f18647q ? 1L : 0L);
                int i8 = iVar.f18648r;
                int b5 = AbstractC2462i.b(i8);
                if (b5 == 0) {
                    i5 = 0;
                } else {
                    if (b5 != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i8 != 1 ? i8 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i5 = 1;
                }
                fVar.f(17, i5);
                C1945c c1945c = iVar.f18640j;
                if (c1945c == null) {
                    fVar.h(18);
                    fVar.h(19);
                    fVar.h(20);
                    fVar.h(21);
                    fVar.h(22);
                    fVar.h(23);
                    fVar.h(24);
                    fVar.h(25);
                    return;
                }
                int i9 = c1945c.f16982a;
                int b6 = AbstractC2462i.b(i9);
                if (b6 == 0) {
                    i6 = 0;
                } else if (b6 != 1) {
                    if (b6 == 2) {
                        i6 = 2;
                    } else if (b6 == 3) {
                        i6 = 3;
                    } else if (b6 == 4) {
                        i6 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i9 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC0467k.E(i9) + " to int");
                        }
                        i6 = 5;
                    }
                }
                fVar.f(18, i6);
                fVar.f(19, c1945c.f16983b ? 1L : 0L);
                fVar.f(20, c1945c.f16984c ? 1L : 0L);
                fVar.f(21, c1945c.f16985d ? 1L : 0L);
                fVar.f(22, c1945c.f16986e ? 1L : 0L);
                fVar.f(23, c1945c.f);
                fVar.f(24, c1945c.f16987g);
                C1947e c1947e = c1945c.f16988h;
                byte[] bArr = null;
                ObjectOutputStream objectOutputStream3 = null;
                byte[] bArr2 = null;
                if (c1947e.f16991a.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                hashSet = c1947e.f16991a;
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream = bArr2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                        }
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    try {
                        objectOutputStream2.writeInt(hashSet.size());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            C1946d c1946d = (C1946d) it.next();
                            objectOutputStream2.writeUTF(c1946d.f16989a.toString());
                            objectOutputStream2.writeBoolean(c1946d.f16990b);
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e = e7;
                        objectOutputStream3 = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream3 != null) {
                            try {
                                objectOutputStream3.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        bArr = bArr2;
                        if (bArr != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != 0) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            throw th;
                        }
                    }
                    bArr2 = byteArrayOutputStream.toByteArray();
                    bArr = bArr2;
                }
                if (bArr != null) {
                    fVar.h(25);
                    return;
                } else {
                    fVar.d(25, bArr);
                    return;
                }
            default:
                j jVar = (j) obj;
                String str10 = jVar.f18649a;
                if (str10 == null) {
                    fVar.h(1);
                } else {
                    fVar.i(str10, 1);
                }
                String str11 = jVar.f18650b;
                if (str11 == null) {
                    fVar.h(2);
                    return;
                } else {
                    fVar.i(str11, 2);
                    return;
                }
        }
    }

    public final void e(Object obj) {
        Y1.f a5 = a();
        try {
            d(a5, obj);
            a5.f6136n.executeInsert();
        } finally {
            c(a5);
        }
    }
}
