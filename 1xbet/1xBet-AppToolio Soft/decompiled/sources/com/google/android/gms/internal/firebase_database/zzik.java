package com.google.android.gms.internal.firebase_database;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzik {
    private final List<zzch> zzbz;
    private final List<String> zzca;

    private zzik(List<zzch> list, List<String> list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.zzbz = list;
        this.zzca = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzja zzjaVar, zzim zzimVar) {
        if (zzjaVar.zzfk()) {
            zzimVar.zzb((zziv<?>) zzjaVar);
            return;
        }
        if (zzjaVar.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        }
        if (zzjaVar instanceof zzif) {
            ((zzif) zzjaVar).zza((zzii) new zzil(zzimVar), true);
            return;
        }
        String valueOf = String.valueOf(zzjaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Expected children node, but got: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static zzik zzh(zzja zzjaVar) {
        List list;
        List list2;
        zzin zzinVar = new zzin(zzjaVar);
        if (zzjaVar.isEmpty()) {
            return new zzik(Collections.emptyList(), Collections.singletonList(""));
        }
        zzim zzimVar = new zzim(zzinVar);
        zza(zzjaVar, zzimVar);
        zzimVar.zzft();
        list = zzimVar.zzrp;
        list2 = zzimVar.zzrq;
        return new zzik(list, list2);
    }

    public final List<zzch> zzo() {
        return Collections.unmodifiableList(this.zzbz);
    }

    public final List<String> zzp() {
        return Collections.unmodifiableList(this.zzca);
    }
}
