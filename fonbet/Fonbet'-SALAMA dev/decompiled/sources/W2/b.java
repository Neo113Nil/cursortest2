package W2;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* loaded from: classes.dex */
public abstract class b extends zzb implements c {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean zzf = zzc.zzf(parcel);
            zzc.zzb(parcel);
            zzc(zzf);
        }
        return true;
    }
}
