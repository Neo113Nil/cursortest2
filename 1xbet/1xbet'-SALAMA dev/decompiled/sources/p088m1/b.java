package p088m1;

import D0.j;
import D0.m;
import K0.f;
import W5.AbstractC0486a1;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import p023d1.c;
import p023d1.d;
import p023d1.g;
import p097n3.a;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, int i7) {
        super(jVar);
        this.f15211d = i7;
    }

    @Override // D0.m
    public final String b() {
        switch (this.f15211d) {
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

    public final void d(f fVar, Object obj) throws Throwable {
        int i7;
        int i8;
        Throwable th;
        switch (this.f15211d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f15209a;
                if (str == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str);
                }
                String str2 = aVar.f15210b;
                if (str2 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.e(2, str2);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str3 = cVar.f15212a;
                if (str3 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str3);
                }
                Long l7 = cVar.f15213b;
                if (l7 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.c(2, l7.longValue());
                    return;
                }
            case 2:
                d dVar = (d) obj;
                String str4 = dVar.f15214a;
                if (str4 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str4);
                }
                fVar.c(2, dVar.f15215b);
                return;
            case 3:
                f fVar2 = (f) obj;
                fVar2.getClass();
                fVar.d(1);
                String str5 = fVar2.f15217a;
                if (str5 == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.e(2, str5);
                    return;
                }
            case 4:
                g gVar = (g) obj;
                String str6 = gVar.f15218a;
                if (str6 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str6);
                }
                byte[] bArrC = g.c(gVar.f15219b);
                if (bArrC == null) {
                    fVar.d(2);
                    return;
                } else {
                    fVar.b(2, bArrC);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f15222a;
                int i9 = 1;
                if (str7 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str7);
                }
                fVar.c(2, a.U(iVar.f15223b));
                String str8 = iVar.f15224c;
                if (str8 == null) {
                    fVar.d(3);
                } else {
                    fVar.e(3, str8);
                }
                String str9 = iVar.f15225d;
                if (str9 == null) {
                    fVar.d(4);
                } else {
                    fVar.e(4, str9);
                }
                byte[] bArrC2 = g.c(iVar.f15226e);
                if (bArrC2 == null) {
                    fVar.d(5);
                } else {
                    fVar.b(5, bArrC2);
                }
                byte[] bArrC3 = g.c(iVar.f15227f);
                if (bArrC3 == null) {
                    fVar.d(6);
                } else {
                    fVar.b(6, bArrC3);
                }
                fVar.c(7, iVar.f15228g);
                fVar.c(8, iVar.f15229h);
                fVar.c(9, iVar.f15230i);
                fVar.c(10, iVar.f15231k);
                int i10 = iVar.f15232l;
                int iE = e.e(i10);
                if (iE == 0) {
                    i7 = 0;
                } else {
                    if (iE != 1) {
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(i10 != 1 ? i10 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i7 = 1;
                }
                fVar.c(11, i7);
                fVar.c(12, iVar.f15233m);
                fVar.c(13, iVar.f15234n);
                fVar.c(14, iVar.f15235o);
                fVar.c(15, iVar.f15236p);
                fVar.c(16, iVar.f15237q ? 1L : 0L);
                int i11 = iVar.f15238r;
                int iE2 = e.e(i11);
                if (iE2 == 0) {
                    i8 = 0;
                } else {
                    if (iE2 != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i11 != 1 ? i11 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i8 = 1;
                }
                fVar.c(17, i8);
                c cVar2 = iVar.j;
                if (cVar2 == null) {
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
                int i12 = cVar2.f12349a;
                int iE3 = e.e(i12);
                if (iE3 == 0) {
                    i9 = 0;
                } else if (iE3 != 1) {
                    if (iE3 == 2) {
                        i9 = 2;
                    } else if (iE3 == 3) {
                        i9 = 3;
                    } else if (iE3 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC0486a1.y(i12) + " to int");
                        }
                        i9 = 5;
                    }
                }
                fVar.c(18, i9);
                fVar.c(19, cVar2.f12350b ? 1L : 0L);
                fVar.c(20, cVar2.f12351c ? 1L : 0L);
                fVar.c(21, cVar2.f12352d ? 1L : 0L);
                fVar.c(22, cVar2.f12353e ? 1L : 0L);
                fVar.c(23, cVar2.f12354f);
                fVar.c(24, cVar2.f12355g);
                p023d1.e eVar = cVar2.f12356h;
                byte[] byteArray = null;
                objectOutputStream = null;
                ObjectOutputStream objectOutputStream = null;
                if (eVar.f12359a.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                HashSet<d> hashSet = eVar.f12359a;
                                try {
                                    objectOutputStream2.writeInt(hashSet.size());
                                    for (d dVar2 : hashSet) {
                                        objectOutputStream2.writeUTF(dVar2.f12357a.toString());
                                        objectOutputStream2.writeBoolean(dVar2.f12358b);
                                    }
                                    try {
                                        objectOutputStream2.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                    byteArrayOutputStream.close();
                                } catch (IOException e8) {
                                    e = e8;
                                    objectOutputStream = objectOutputStream2;
                                    e.printStackTrace();
                                    if (objectOutputStream != null) {
                                        try {
                                            objectOutputStream.close();
                                        } catch (IOException e9) {
                                            e9.printStackTrace();
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectOutputStream = objectOutputStream2;
                                    if (objectOutputStream != null) {
                                        try {
                                            objectOutputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (IOException e12) {
                                e = e12;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                if (byteArray == null) {
                    fVar.d(25);
                    return;
                } else {
                    fVar.b(25, byteArray);
                    return;
                }
            default:
                j jVar = (j) obj;
                String str10 = jVar.f15239a;
                if (str10 == null) {
                    fVar.d(1);
                } else {
                    fVar.e(1, str10);
                }
                String str11 = jVar.f15240b;
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
        f fVarA = a();
        try {
            d(fVarA, obj);
            fVarA.f3881d.executeInsert();
        } finally {
            c(fVarA);
        }
    }
}
