package m1;

import D0.m;
import W5.AbstractC0486a1;
import android.os.Build;
import d1.C0950c;
import d1.C0951d;
import d1.C0952e;
import d1.C0954g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import n3.AbstractC1464a;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427b extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1427b(D0.j jVar, int i7) {
        super(jVar);
        this.f15205d = i7;
    }

    @Override // D0.m
    public final String b() {
        switch (this.f15205d) {
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0215  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01ef -> B:68:0x0209). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(K0.f fVar, Object obj) {
        int i7;
        int i8;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        HashSet hashSet;
        switch (this.f15205d) {
            case 0:
                C1426a c1426a = (C1426a) obj;
                String str = c1426a.f15203a;
                if (str == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str);
                }
                String str2 = c1426a.f15204b;
                if (str2 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.e(2, str2);
                    return;
                }
            case 1:
                C1428c c1428c = (C1428c) obj;
                String str3 = c1428c.f15206a;
                if (str3 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str3);
                }
                Long l7 = c1428c.f15207b;
                if (l7 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.c(2, l7.longValue());
                    return;
                }
            case 2:
                String str4 = ((C1429d) obj).f15208a;
                if (str4 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str4);
                }
                fVar.c(2, r0.f15209b);
                return;
            case 3:
                C1431f c1431f = (C1431f) obj;
                c1431f.getClass();
                fVar.d(1);
                String str5 = c1431f.f15211a;
                if (str5 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.e(2, str5);
                    return;
                }
            case 4:
                C1432g c1432g = (C1432g) obj;
                String str6 = c1432g.f15212a;
                if (str6 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str6);
                }
                byte[] c3 = C0954g.c(c1432g.f15213b);
                if (c3 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.b(2, c3);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f15216a;
                int i9 = 1;
                if (str7 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str7);
                }
                fVar.c(2, AbstractC1464a.U(iVar.f15217b));
                String str8 = iVar.f15218c;
                if (str8 == null) {
                    fVar.d(3);
                } else {
                    fVar.e(3, str8);
                }
                String str9 = iVar.f15219d;
                if (str9 == null) {
                    fVar.d(4);
                } else {
                    fVar.e(4, str9);
                }
                byte[] c4 = C0954g.c(iVar.f15220e);
                if (c4 == null) {
                    fVar.d(5);
                } else {
                    fVar.b(5, c4);
                }
                byte[] c7 = C0954g.c(iVar.f15221f);
                if (c7 == null) {
                    fVar.d(6);
                } else {
                    fVar.b(6, c7);
                }
                fVar.c(7, iVar.f15222g);
                fVar.c(8, iVar.f15223h);
                fVar.c(9, iVar.f15224i);
                fVar.c(10, iVar.f15225k);
                int i10 = iVar.f15226l;
                int e7 = t.e.e(i10);
                if (e7 == 0) {
                    i7 = 0;
                } else {
                    if (e7 != 1) {
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(i10 != 1 ? i10 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i7 = 1;
                }
                fVar.c(11, i7);
                fVar.c(12, iVar.f15227m);
                fVar.c(13, iVar.f15228n);
                fVar.c(14, iVar.f15229o);
                fVar.c(15, iVar.f15230p);
                fVar.c(16, iVar.f15231q ? 1L : 0L);
                int i11 = iVar.f15232r;
                int e8 = t.e.e(i11);
                if (e8 == 0) {
                    i8 = 0;
                } else {
                    if (e8 != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i11 != 1 ? i11 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i8 = 1;
                }
                fVar.c(17, i8);
                C0950c c0950c = iVar.j;
                if (c0950c == null) {
                    fVar.d(18);
                    fVar.d(19);
                    fVar.d(20);
                    fVar.d(21);
                    fVar.d(22);
                    fVar.d(23);
                    fVar.d(24);
                    fVar.d(25);
                    return;
                }
                int i12 = c0950c.f12343a;
                int e9 = t.e.e(i12);
                if (e9 == 0) {
                    i9 = 0;
                } else if (e9 != 1) {
                    if (e9 == 2) {
                        i9 = 2;
                    } else if (e9 == 3) {
                        i9 = 3;
                    } else if (e9 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC0486a1.y(i12) + " to int");
                        }
                        i9 = 5;
                    }
                }
                fVar.c(18, i9);
                fVar.c(19, c0950c.f12344b ? 1L : 0L);
                fVar.c(20, c0950c.f12345c ? 1L : 0L);
                fVar.c(21, c0950c.f12346d ? 1L : 0L);
                fVar.c(22, c0950c.f12347e ? 1L : 0L);
                fVar.c(23, c0950c.f12348f);
                fVar.c(24, c0950c.f12349g);
                C0952e c0952e = c0950c.f12350h;
                byte[] bArr = null;
                r4 = null;
                ObjectOutputStream objectOutputStream2 = null;
                if (c0952e.f12353a.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                hashSet = c0952e.f12353a;
                            } catch (IOException e10) {
                                e = e10;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        objectOutputStream.writeInt(hashSet.size());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            C0951d c0951d = (C0951d) it.next();
                            objectOutputStream.writeUTF(c0951d.f12351a.toString());
                            objectOutputStream.writeBoolean(c0951d.f12352b);
                        }
                        try {
                            objectOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e13) {
                        e = e13;
                        objectOutputStream2 = objectOutputStream;
                        e.printStackTrace();
                        if (objectOutputStream2 != null) {
                            try {
                                objectOutputStream2.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        if (bArr != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream2 = objectOutputStream;
                        if (objectOutputStream2 != null) {
                            try {
                                objectOutputStream2.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            throw th;
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                }
                if (bArr != null) {
                    fVar.d(25);
                    return;
                } else {
                    fVar.b(25, bArr);
                    return;
                }
            default:
                j jVar = (j) obj;
                String str10 = jVar.f15233a;
                if (str10 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str10);
                }
                String str11 = jVar.f15234b;
                if (str11 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.e(2, str11);
                    return;
                }
        }
    }

    public final void e(Object obj) {
        K0.f a2 = a();
        try {
            d(a2, obj);
            a2.f3881d.executeInsert();
        } finally {
            c(a2);
        }
    }
}
