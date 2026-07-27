package com.yasirkula.unity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class RuntimePermissionsFragment extends Fragment {
    public static final String PERMISSIONS = "RTP_Permissions";
    private static final int PERMISSIONS_REQUEST_CODE = 122655;
    private String[] m_permissions;
    private final RuntimePermissionsReceiver permissionReceiver;

    public RuntimePermissionsFragment() {
        this.permissionReceiver = null;
    }

    public RuntimePermissionsFragment(RuntimePermissionsReceiver runtimePermissionsReceiver) {
        this.permissionReceiver = runtimePermissionsReceiver;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.permissionReceiver == null) {
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        String[] stringArray = getArguments().getStringArray(PERMISSIONS);
        this.m_permissions = stringArray;
        if (stringArray != null) {
            requestPermissions(stringArray, PERMISSIONS_REQUEST_CODE);
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != PERMISSIONS_REQUEST_CODE) {
            return;
        }
        if (this.permissionReceiver == null || this.m_permissions == null) {
            Log.e("Unity", "Fragment data got reset while asking permissions!");
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
        ArrayList arrayList = new ArrayList(this.m_permissions.length);
        for (int i2 = 0; i2 < this.m_permissions.length; i2++) {
            arrayList.add(2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < strArr.length && i4 < iArr.length; i4++) {
            String str = strArr[i4];
            int i5 = 0;
            int i6 = -1;
            while (true) {
                String[] strArr2 = this.m_permissions;
                if (i5 >= strArr2.length || i6 != -1) {
                    break;
                }
                if (str.equals(strArr2[i5])) {
                    i6 = i5;
                }
                i5++;
            }
            if (i6 == -1) {
                Log.w("Unity", "Didn't request permission for: " + str);
            } else {
                i3++;
                try {
                    if (iArr[i4] == 0) {
                        arrayList.set(i6, 1);
                    } else if (!shouldShowRequestPermissionRationale(str)) {
                        arrayList.set(i6, 0);
                    } else {
                        arrayList.set(i6, 2);
                    }
                } catch (Exception e) {
                    Log.e("Unity", "Exception:", e);
                    arrayList.set(i6, 0);
                }
            }
        }
        if (i3 != this.m_permissions.length) {
            Log.e("Unity", "Missed some permissions!");
        }
        String str2 = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            str2 = str2 + arrayList.get(i7);
        }
        this.permissionReceiver.OnPermissionResult(str2);
        getFragmentManager().beginTransaction().remove(this).commit();
        try {
            Intent intent = new Intent(getActivity(), getActivity().getClass());
            intent.setFlags(131072);
            getActivity().startActivityIfNeeded(intent, 0);
        } catch (Exception e2) {
            Log.e("Unity", "Exception (resume):", e2);
        }
    }
}
