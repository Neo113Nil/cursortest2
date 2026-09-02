package io.flutter.plugin.platform;

import android.util.Log;
import androidx.profileinstaller.ProfileInstallReceiver;
import o.InterfaceC0073e;

/* loaded from: classes.dex */
public final class i implements InterfaceC0073e, p0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f674b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f675c;

    public /* synthetic */ i(int i2, Object obj) {
        this.f674b = i2;
        this.f675c = obj;
    }

    @Override // p0.d
    public Object a(Object obj, a0.b bVar) {
        ((l.a) this.f675c).accept(obj);
        return W.g.f394a;
    }

    @Override // o.InterfaceC0073e
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.InterfaceC0073e
    public void c(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f675c).setResultCode(i2);
    }

    public void d(int i2) {
        j jVar = (j) this.f675c;
        jVar.f688n.remove(Integer.valueOf(i2));
        if (jVar.f682h.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
    }

    public String toString() {
        switch (this.f674b) {
            case 2:
                return "<" + ((String) this.f675c) + '>';
            default:
                return super.toString();
        }
    }
}
