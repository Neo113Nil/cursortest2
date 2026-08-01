package sg.bigo.ads.T0;

import android.os.Parcel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements sg.bigo.ads.U.g {
    public int c;

    /* renamed from: a, reason: collision with root package name */
    public int f12550a = 0;
    public int b = 20;
    public int d = 5;

    public d(int i) {
        this.c = i;
    }

    public final void a(JSONObject jSONObject) {
        String str;
        int i = this.c;
        if (i == 1) {
            this.f12550a = jSONObject.optInt("nat_load_fail_fill", 0);
            this.d = jSONObject.optInt("nat_time_for_check_process", 5);
            str = "nat_min_video_loading_pro";
        } else if (i == 12) {
            this.f12550a = jSONObject.optInt("spl_load_fail_fill", 0);
            this.d = jSONObject.optInt("spl_time_for_check_process", 5);
            str = "spl_min_video_loading_pro";
        } else if (i == 20) {
            this.f12550a = jSONObject.optInt("pop_load_fail_fill", 0);
            this.d = jSONObject.optInt("pop_time_for_check_process", 5);
            str = "pop_min_video_loading_pro";
        } else if (i == 3) {
            this.f12550a = jSONObject.optInt("int_load_fail_fill", 0);
            this.d = jSONObject.optInt("int_time_for_check_process", 5);
            str = "int_min_video_loading_pro";
        } else {
            if (i != 4) {
                return;
            }
            this.f12550a = jSONObject.optInt("rew_load_fail_fill", 0);
            this.d = jSONObject.optInt("rew_time_for_check_process", 5);
            str = "rew_min_video_loading_pro";
        }
        this.b = jSONObject.optInt(str, 20);
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeInt(this.f12550a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12550a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
