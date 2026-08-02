package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.u;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class m extends z {
    public static ScheduledThreadPoolExecutor d;
    public final String c;
    public static final b Companion = new b();

    @JvmField
    public static final Parcelable.Creator<m> CREATOR = new a();

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new m(source);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public static final class b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.z
    public final String o() {
        return this.c;
    }

    @Override // com.facebook.login.z
    public final int u(u.c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        FragmentActivity o = n().o();
        if (o == null || o.isFinishing()) {
            return 1;
        }
        l lVar = new l();
        lVar.show(o.getSupportFragmentManager(), "login_with_facebook");
        lVar.m(request);
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.c = "device_auth";
    }
}
