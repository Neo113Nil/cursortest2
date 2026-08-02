package O9;

import O9.g;
import android.hardware.Camera;
import android.util.Log;
import g.C6594f;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class c {
    static {
        Pattern.compile(";");
    }

    private static String a(String str, List list, String... strArr) {
        StringBuilder b11 = C6594f.b("Requesting ", str, " value from among: ");
        b11.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", b11.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, g.a aVar, boolean z11) {
        String a11;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z11 || aVar == g.a.AUTO) {
            a11 = a("focus mode", supportedFocusModes, "auto");
        } else if (aVar == g.a.CONTINUOUS) {
            a11 = a("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (aVar == g.a.INFINITY) {
            a11 = a("focus mode", supportedFocusModes, "infinity");
        } else if (aVar == g.a.MACRO) {
            a11 = a("focus mode", supportedFocusModes, "macro");
        } else {
            a11 = null;
        }
        if (!z11 && a11 == null) {
            a11 = a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a11 != null) {
            if (a11.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(a11));
            } else {
                parameters.setFocusMode(a11);
            }
        }
    }

    public static void c(Camera.Parameters parameters, boolean z11) {
        String a11;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z11) {
            a11 = a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            a11 = a("flash mode", supportedFlashModes, "off");
        }
        if (a11 != null) {
            if (a11.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(a11));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(a11));
                parameters.setFlashMode(a11);
            }
        }
    }
}
