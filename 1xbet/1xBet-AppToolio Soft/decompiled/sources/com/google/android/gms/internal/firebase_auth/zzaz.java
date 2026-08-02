package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaz implements com.google.firebase.auth.api.internal.zzdp<zzo> {
    private String zzaf;
    private String zzag;
    private String zzah;
    private String zzbh;
    private String zzbi;
    private String zzbr;
    private boolean zzbt = true;
    private zzbd zzkf = new zzbd();
    private zzbd zzke = new zzbd();

    @Nullable
    public final String getDisplayName() {
        return this.zzbh;
    }

    @Nullable
    public final String getEmail() {
        return this.zzah;
    }

    @Nullable
    public final String getPassword() {
        return this.zzbi;
    }

    @NonNull
    public final zzaz zzaa(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        this.zzke.zzbc().add(str);
        return this;
    }

    @NonNull
    public final zzaz zzab(@NonNull String str) {
        this.zzag = Preconditions.checkNotEmpty(str);
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzdp
    public final /* synthetic */ zzo zzao() {
        char c;
        zzo zzoVar = new zzo();
        zzoVar.zzaf = this.zzaf;
        zzoVar.zzah = this.zzah;
        zzoVar.zzbi = this.zzbi;
        zzoVar.zzbh = this.zzbh;
        zzoVar.zzbr = this.zzbr;
        zzoVar.zzbu = (String[]) this.zzke.zzbc().toArray(new String[this.zzke.zzbc().size()]);
        List<String> zzbc = this.zzkf.zzbc();
        int[] iArr = new int[zzbc.size()];
        for (int i = 0; i < zzbc.size(); i++) {
            String str = zzbc.get(i);
            int hashCode = str.hashCode();
            int i2 = 2;
            if (hashCode == -333046776) {
                if (str.equals("DISPLAY_NAME")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 66081660) {
                if (str.equals("EMAIL")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 1939891618) {
                if (hashCode == 1999612571 && str.equals("PASSWORD")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("PHOTO_URL")) {
                    c = 3;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    break;
                case 2:
                    i2 = 5;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            iArr[i] = i2;
        }
        zzoVar.zzbs = iArr;
        zzoVar.zzbt = this.zzbt;
        zzoVar.zzag = this.zzag;
        return zzoVar;
    }

    @Nullable
    public final String zzt() {
        return this.zzbr;
    }

    public final boolean zzu(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzkf.zzbc().contains(str);
    }

    @NonNull
    public final zzaz zzv(@NonNull String str) {
        this.zzaf = Preconditions.checkNotEmpty(str);
        return this;
    }

    @NonNull
    public final zzaz zzw(@Nullable String str) {
        if (str == null) {
            this.zzkf.zzbc().add("EMAIL");
        } else {
            this.zzah = str;
        }
        return this;
    }

    @NonNull
    public final zzaz zzx(@Nullable String str) {
        if (str == null) {
            this.zzkf.zzbc().add("PASSWORD");
        } else {
            this.zzbi = str;
        }
        return this;
    }

    @NonNull
    public final zzaz zzy(@Nullable String str) {
        if (str == null) {
            this.zzkf.zzbc().add("DISPLAY_NAME");
        } else {
            this.zzbh = str;
        }
        return this;
    }

    @NonNull
    public final zzaz zzz(@Nullable String str) {
        if (str == null) {
            this.zzkf.zzbc().add("PHOTO_URL");
        } else {
            this.zzbr = str;
        }
        return this;
    }
}
