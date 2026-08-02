package com.google.android.gms.internal.firebase_database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseException;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzu implements zzfw {
    private static final Charset zzbq = Charset.forName("UTF-8");
    private final SQLiteDatabase zzbr;
    private final zzhz zzbs;
    private boolean zzbt;
    private long zzbu = 0;

    public zzu(Context context, zzbz zzbzVar, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.zzbs = zzbzVar.zzp("Persistence");
            this.zzbr = zza(context, encode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final int zza(String str, zzch zzchVar) {
        String zzc = zzc(zzchVar);
        return this.zzbr.delete(str, "path >= ? AND path < ?", new String[]{zzc, zzc(zzc)});
    }

    private final Cursor zza(zzch zzchVar, String[] strArr) {
        String zzc = zzc(zzchVar);
        String zzc2 = zzc(zzc);
        String[] strArr2 = new String[zzchVar.size() + 3];
        StringBuilder sb = new StringBuilder("(");
        zzch zzchVar2 = zzchVar;
        int i = 0;
        while (!zzchVar2.isEmpty()) {
            sb.append("path");
            sb.append(" = ? OR ");
            strArr2[i] = zzc(zzchVar2);
            zzchVar2 = zzchVar2.zzby();
            i++;
        }
        sb.append("path");
        sb.append(" = ?)");
        strArr2[i] = zzc(zzch.zzbt());
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[zzchVar.size() + 1] = zzc;
        strArr2[zzchVar.size() + 2] = zzc2;
        return this.zzbr.query("serverCache", strArr, concat, strArr2, null, null, "path");
    }

    private static SQLiteDatabase zza(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new zzx(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new DatabaseException("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    private static zzja zza(byte[] bArr) {
        try {
            return zzjd.zza(zzke.zzw(new String(bArr, zzbq)), zzir.zzfv());
        } catch (IOException e) {
            String valueOf = String.valueOf(new String(bArr, zzbq));
            throw new RuntimeException(valueOf.length() != 0 ? "Could not deserialize node: ".concat(valueOf) : new String("Could not deserialize node: "), e);
        }
    }

    private static String zza(zzch zzchVar, int i) {
        String valueOf = String.valueOf(zzc(zzchVar));
        String valueOf2 = String.valueOf(String.format(".part-%04d", Integer.valueOf(i)));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String zza(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(longValue);
        }
        return sb.toString();
    }

    private static List<byte[]> zza(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / 262144) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 262144;
            int min = Math.min(262144, bArr.length - i3);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i3, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    private final void zza(zzch zzchVar, long j, String str, byte[] bArr) {
        zzn();
        this.zzbr.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", zzc(zzchVar));
            contentValues.put(AppMeasurement.Param.TYPE, str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.zzbr.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List<byte[]> zza = zza(bArr, 262144);
        for (int i = 0; i < zza.size(); i++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", zzc(zzchVar));
            contentValues2.put(AppMeasurement.Param.TYPE, str);
            contentValues2.put("part", Integer.valueOf(i));
            contentValues2.put("node", zza.get(i));
            this.zzbr.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    private final void zza(zzch zzchVar, zzch zzchVar2, zzgj<Long> zzgjVar, zzgj<Long> zzgjVar2, zzfx zzfxVar, List<zzkn<zzch, zzja>> list) {
        if (zzgjVar.getValue() == null) {
            Iterator<Map.Entry<zzid, zzgj<Long>>> it = zzgjVar.zzdm().iterator();
            while (it.hasNext()) {
                Map.Entry<zzid, zzgj<Long>> next = it.next();
                zzid key = next.getKey();
                zza(zzchVar, zzchVar2.zza(key), next.getValue(), zzgjVar2.zze(key), zzfxVar.zzd(next.getKey()), list);
            }
            return;
        }
        int intValue = ((Integer) zzfxVar.zza(0, new zzv(this, zzgjVar2))).intValue();
        if (intValue > 0) {
            zzch zzh = zzchVar.zzh(zzchVar2);
            if (this.zzbs.zzfa()) {
                this.zzbs.zza(String.format("Need to rewrite %d nodes below path %s", Integer.valueOf(intValue), zzh), null, new Object[0]);
            }
            zzfxVar.zza(null, new zzw(this, zzgjVar2, list, zzchVar2, zzb(zzh)));
        }
    }

    private final void zza(zzch zzchVar, zzja zzjaVar, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 0;
            int i3 = 0;
            for (zziz zzizVar : zzjaVar) {
                i += zza("serverCache", zzchVar.zza(zzizVar.zzge()));
                i3 += zzc(zzchVar.zza(zzizVar.zzge()), zzizVar.zzd());
            }
            i2 = i3;
        } else {
            i = zza("serverCache", zzchVar);
            i2 = zzc(zzchVar, zzjaVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i), zzchVar.toString(), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    private static byte[] zza(Object obj) {
        try {
            return zzke.zze(obj).getBytes(zzbq);
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    private static byte[] zza(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : list) {
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final zzja zzb(zzch zzchVar) {
        long j;
        long j2;
        zzch zzchVar2;
        int i;
        zzja zzjaVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor zza = zza(zzchVar, new String[]{"path", FirebaseAnalytics.Param.VALUE});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (zza.moveToNext()) {
            try {
                arrayList.add(zza.getString(0));
                arrayList2.add(zza.getBlob(1));
            } catch (Throwable th) {
                zza.close();
                throw th;
            }
        }
        zza.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        zzir zzfv = zzir.zzfv();
        HashMap hashMap = new HashMap();
        zzir zzirVar = zzfv;
        int i2 = 0;
        boolean z = false;
        while (i2 < arrayList2.size()) {
            if (((String) arrayList.get(i2)).endsWith(".part-0000")) {
                j2 = currentTimeMillis4;
                zzchVar2 = new zzch(((String) arrayList.get(i2)).substring(0, r12.length() - 10));
                int i3 = i2 + 1;
                String zzc = zzc(zzchVar2);
                if (!((String) arrayList.get(i2)).startsWith(zzc)) {
                    throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
                }
                while (true) {
                    if (i3 >= arrayList.size()) {
                        j = currentTimeMillis2;
                        break;
                    }
                    j = currentTimeMillis2;
                    if (!((String) arrayList.get(i3)).equals(zza(zzchVar2, i3 - i2))) {
                        break;
                    }
                    i3++;
                    currentTimeMillis2 = j;
                }
                if (i3 < arrayList.size()) {
                    String str = (String) arrayList.get(i3);
                    String valueOf = String.valueOf(zzc);
                    String valueOf2 = String.valueOf(".part-");
                    if (str.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                        throw new IllegalStateException("Run did not finish with all parts");
                    }
                }
                int i4 = i3 - i2;
                if (this.zzbs.zzfa()) {
                    zzhz zzhzVar = this.zzbs;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Loading split node with ");
                    sb.append(i4);
                    sb.append(" parts.");
                    zzhzVar.zza(sb.toString(), null, new Object[0]);
                }
                int i5 = i4 + i2;
                zzjaVar = zza(zza((List<byte[]>) arrayList2.subList(i2, i5)));
                i = i5 - 1;
            } else {
                j = currentTimeMillis2;
                j2 = currentTimeMillis4;
                zzja zza2 = zza((byte[]) arrayList2.get(i2));
                zzchVar2 = new zzch((String) arrayList.get(i2));
                i = i2;
                zzjaVar = zza2;
            }
            if (zzchVar2.zzbz() != null && zzchVar2.zzbz().zzfh()) {
                hashMap.put(zzchVar2, zzjaVar);
            } else if (zzchVar2.zzi(zzchVar)) {
                zzkq.zza(!z, "Descendants of path must come after ancestors.");
                zzirVar = zzjaVar.zzam(zzch.zza(zzchVar2, zzchVar));
            } else {
                if (!zzchVar.zzi(zzchVar2)) {
                    throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", zzchVar2, zzchVar));
                }
                zzirVar = zzirVar.zzl(zzch.zza(zzchVar, zzchVar2), zzjaVar);
                z = true;
                i2 = i + 1;
                currentTimeMillis4 = j2;
                currentTimeMillis2 = j;
            }
            i2 = i + 1;
            currentTimeMillis4 = j2;
            currentTimeMillis2 = j;
        }
        long j3 = currentTimeMillis2;
        long j4 = currentTimeMillis4;
        zzja zzjaVar2 = zzirVar;
        for (Map.Entry entry : hashMap.entrySet()) {
            zzjaVar2 = zzjaVar2.zzl(zzch.zza(zzchVar, (zzch) entry.getKey()), (zzja) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(zzkl.zzo(zzjaVar2)), zzchVar, Long.valueOf(currentTimeMillis7), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(currentTimeMillis6)), null, new Object[0]);
        }
        return zzjaVar2;
    }

    private final int zzc(zzch zzchVar, zzja zzjaVar) {
        long zzn = zzkl.zzn(zzjaVar);
        if (!(zzjaVar instanceof zzif) || zzn <= PlaybackStateCompat.ACTION_PREPARE) {
            zzd(zzchVar, zzjaVar);
            return 1;
        }
        int i = 0;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", zzchVar, Long.valueOf(zzn), 16384), null, new Object[0]);
        }
        for (zziz zzizVar : zzjaVar) {
            i += zzc(zzchVar.zza(zzizVar.zzge()), zzizVar.zzd());
        }
        if (!zzjaVar.zzfl().isEmpty()) {
            zzd(zzchVar.zza(zzid.zzfe()), zzjaVar.zzfl());
            i++;
        }
        zzd(zzchVar, zzir.zzfv());
        return i + 1;
    }

    private static String zzc(zzch zzchVar) {
        return zzchVar.isEmpty() ? "/" : String.valueOf(zzchVar.toString()).concat("/");
    }

    private static String zzc(String str) {
        String substring = str.substring(0, str.length() - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
        sb.append(substring);
        sb.append('0');
        return sb.toString();
    }

    private final void zzd(zzch zzchVar, zzja zzjaVar) {
        byte[] zza = zza(zzjaVar.getValue(true));
        if (zza.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", zzc(zzchVar));
            contentValues.put(FirebaseAnalytics.Param.VALUE, zza);
            this.zzbr.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List<byte[]> zza2 = zza(zza, 262144);
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            int size = zza2.size();
            StringBuilder sb = new StringBuilder(45);
            sb.append("Saving huge leaf node with ");
            sb.append(size);
            sb.append(" parts.");
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        for (int i = 0; i < zza2.size(); i++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", zza(zzchVar, i));
            contentValues2.put(FirebaseAnalytics.Param.VALUE, zza2.get(i));
            this.zzbr.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    private final void zzn() {
        zzkq.zza(this.zzbt, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void beginTransaction() {
        zzkq.zza(!this.zzbt, "runInTransaction called when an existing transaction is already in progress.");
        if (this.zzbs.zzfa()) {
            this.zzbs.zza("Starting transaction.", null, new Object[0]);
        }
        this.zzbr.beginTransaction();
        this.zzbt = true;
        this.zzbu = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void endTransaction() {
        this.zzbr.endTransaction();
        this.zzbt = false;
        long currentTimeMillis = System.currentTimeMillis() - this.zzbu;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void setTransactionSuccessful() {
        this.zzbr.setTransactionSuccessful();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final zzja zza(zzch zzchVar) {
        return zzb(zzchVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final Set<zzid> zza(Set<Long> set) {
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zza((Collection<Long>) set);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 8);
        sb.append("id IN (");
        sb.append(zza);
        sb.append(")");
        Cursor query = this.zzbr.query(true, "trackedKeys", new String[]{"key"}, sb.toString(), null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(zzid.zzt(query.getString(0)));
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(long j) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzbr.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(long j, Set<zzid> set) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        this.zzbr.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j)});
        for (zzid zzidVar : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", zzidVar.zzfg());
            this.zzbr.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(long j, Set<zzid> set, Set<zzid> set2) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        Iterator<zzid> it = set2.iterator();
        while (it.hasNext()) {
            this.zzbr.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, it.next().zzfg()});
        }
        for (zzid zzidVar : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", zzidVar.zzfg());
            this.zzbr.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzch zzchVar, zzbv zzbvVar) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<zzch, zzja>> it = zzbvVar.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<zzch, zzja> next = it.next();
            i += zza("serverCache", zzchVar.zzh(next.getKey()));
            i2 += zzc(zzchVar.zzh(next.getKey()), next.getValue());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i), zzchVar.toString(), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzch zzchVar, zzbv zzbvVar, long j) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        zza(zzchVar, j, "m", zza(zzbvVar.zzd(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzch zzchVar, zzfx zzfxVar) {
        int i;
        int i2;
        zzhz zzhzVar;
        StringBuilder sb;
        String str;
        if (zzfxVar.zzdh()) {
            zzn();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor zza = zza(zzchVar, new String[]{"rowid", "path"});
            zzgj<Long> zzgjVar = new zzgj<>(null);
            zzgj<Long> zzgjVar2 = new zzgj<>(null);
            while (zza.moveToNext()) {
                long j = zza.getLong(0);
                zzch zzchVar2 = new zzch(zza.getString(1));
                if (zzchVar.zzi(zzchVar2)) {
                    zzch zza2 = zzch.zza(zzchVar, zzchVar2);
                    if (zzfxVar.zzv(zza2)) {
                        zzgjVar = zzgjVar.zzb(zza2, (zzch) Long.valueOf(j));
                    } else if (zzfxVar.zzw(zza2)) {
                        zzgjVar2 = zzgjVar2.zzb(zza2, (zzch) Long.valueOf(j));
                    } else {
                        zzhzVar = this.zzbs;
                        String valueOf = String.valueOf(zzchVar);
                        String valueOf2 = String.valueOf(zzchVar2);
                        sb = new StringBuilder(String.valueOf(valueOf).length() + 88 + String.valueOf(valueOf2).length());
                        sb.append("We are pruning at ");
                        sb.append(valueOf);
                        sb.append(" and have data at ");
                        sb.append(valueOf2);
                        str = " that isn't marked for pruning or keeping. Ignoring.";
                    }
                } else {
                    zzhzVar = this.zzbs;
                    String valueOf3 = String.valueOf(zzchVar);
                    String valueOf4 = String.valueOf(zzchVar2);
                    sb = new StringBuilder(String.valueOf(valueOf3).length() + 67 + String.valueOf(valueOf4).length());
                    sb.append("We are pruning at ");
                    sb.append(valueOf3);
                    sb.append(" but we have data stored higher up at ");
                    sb.append(valueOf4);
                    str = ". Ignoring.";
                }
                sb.append(str);
                zzhzVar.zzb(sb.toString(), null);
            }
            if (zzgjVar.isEmpty()) {
                i = 0;
                i2 = 0;
            } else {
                ArrayList arrayList = new ArrayList();
                zza(zzchVar, zzch.zzbt(), zzgjVar, zzgjVar2, zzfxVar, arrayList);
                Collection<Long> values = zzgjVar.values();
                String zza3 = zza(values);
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza3).length() + 11);
                sb2.append("rowid IN (");
                sb2.append(zza3);
                sb2.append(")");
                this.zzbr.delete("serverCache", sb2.toString(), null);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    zzkn zzknVar = (zzkn) obj;
                    zzc(zzchVar.zzh((zzch) zzknVar.getFirst()), (zzja) zzknVar.zzgv());
                }
                i = values.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.zzbs.zzfa()) {
                this.zzbs.zza(String.format("Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzch zzchVar, zzja zzjaVar) {
        zzn();
        zza(zzchVar, zzjaVar, false);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzch zzchVar, zzja zzjaVar, long j) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        zza(zzchVar, j, "o", zza(zzjaVar.getValue(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zza(zzgb zzgbVar) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(zzgbVar.id));
        contentValues.put("path", zzc(zzgbVar.zznp.zzg()));
        contentValues.put("queryParams", zzgbVar.zznp.zzen().zzel());
        contentValues.put("lastUse", Long.valueOf(zzgbVar.zznq));
        contentValues.put("complete", Boolean.valueOf(zzgbVar.zznr));
        contentValues.put("active", Boolean.valueOf(zzgbVar.zzns));
        this.zzbr.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zzb(long j) {
        zzn();
        String valueOf = String.valueOf(j);
        this.zzbr.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.zzbr.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zzb(zzch zzchVar, zzja zzjaVar) {
        zzn();
        zza(zzchVar, zzjaVar, true);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zzc(long j) {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", (Boolean) false);
        contentValues.put("lastUse", Long.valueOf(j));
        this.zzbr.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final Set<zzid> zzd(long j) {
        return zza(Collections.singleton(Long.valueOf(j)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final List<zzfa> zzj() {
        byte[] zza;
        zzfa zzfaVar;
        String[] strArr = {"id", "path", AppMeasurement.Param.TYPE, "part", "node"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzbr.query("writes", strArr, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j = query.getLong(0);
                    zzch zzchVar = new zzch(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        zza = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j);
                        query.moveToPrevious();
                        zza = zza((List<byte[]>) arrayList2);
                    }
                    Object zzw = zzke.zzw(new String(zza, zzbq));
                    if ("o".equals(string)) {
                        zzfaVar = new zzfa(j, zzchVar, zzjd.zza(zzw, zzir.zzfv()), true);
                    } else {
                        if (!"m".equals(string)) {
                            String valueOf = String.valueOf(string);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Got invalid write type: ".concat(valueOf) : new String("Got invalid write type: "));
                        }
                        zzfaVar = new zzfa(j, zzchVar, zzbv.zzf((Map<String, Object>) zzw));
                    }
                    arrayList.add(zzfaVar);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load writes", e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final long zzk() {
        Cursor rawQuery = this.zzbr.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", FirebaseAnalytics.Param.VALUE, "path", "serverCache"), null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final List<zzgb> zzl() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzbr.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new zzgb(query.getLong(0), new zzhh(new zzch(query.getString(1)), zzhe.zzh(zzke.zzv(query.getString(2)))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzfw
    public final void zzm() {
        zzn();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzbr.delete("writes", null, null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbs.zzfa()) {
            this.zzbs.zza(String.format("Deleted %d (all) write(s) in %dms", Integer.valueOf(delete), Long.valueOf(currentTimeMillis2)), null, new Object[0]);
        }
    }
}
