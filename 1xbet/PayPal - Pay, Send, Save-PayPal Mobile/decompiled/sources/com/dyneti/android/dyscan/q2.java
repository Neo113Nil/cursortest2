package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.telephony.TelephonyManager f3333a;
    public final android.app.Activity b;
    public java.lang.Integer c;
    public java.lang.String[] d;
    public java.lang.String[] e;
    public java.lang.String[] f;

    public q2(android.app.Activity activity) {
        this.b = activity;
        this.f3333a = (android.telephony.TelephonyManager) activity.getSystemService("phone");
    }

    public final void a(com.dyneti.android.dyscan.n2 n2Var) {
        java.lang.String num;
        java.lang.CharSequence operatorAlphaLong;
        java.lang.String num2;
        java.lang.CharSequence operatorAlphaLong2;
        java.lang.String num3;
        java.lang.CharSequence operatorAlphaLong3;
        java.lang.CharSequence operatorAlphaLong4;
        boolean z = androidx.core.content.ContextCompat.checkSelfPermission(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean z2 = androidx.core.content.ContextCompat.checkSelfPermission(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (z && z2) {
            java.util.List<android.telephony.CellInfo> allCellInfo = this.f3333a.getAllCellInfo();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (allCellInfo != null) {
                for (android.telephony.CellInfo cellInfo : allCellInfo) {
                    java.lang.String str = null;
                    if (cellInfo instanceof android.telephony.CellInfoGsm) {
                        android.telephony.CellIdentityGsm cellIdentity = ((android.telephony.CellInfoGsm) cellInfo).getCellIdentity();
                        int i = android.os.Build.VERSION.SDK_INT;
                        if (i >= 28 && (operatorAlphaLong = cellIdentity.getOperatorAlphaLong()) != null) {
                            arrayList3.add(operatorAlphaLong.toString());
                        }
                        if (i >= 28) {
                            num = cellIdentity.getMccString();
                        } else {
                            int mcc = cellIdentity.getMcc();
                            num = mcc != Integer.MAX_VALUE ? java.lang.Integer.toString(mcc) : null;
                        }
                        if (i >= 28) {
                            str = cellIdentity.getMncString();
                        } else {
                            int mnc = cellIdentity.getMnc();
                            if (mnc != Integer.MAX_VALUE) {
                                str = java.lang.Integer.toString(mnc);
                            }
                        }
                        if (num != null && str != null) {
                            arrayList.add(num);
                            arrayList2.add(str);
                        }
                    } else if (cellInfo instanceof android.telephony.CellInfoWcdma) {
                        android.telephony.CellIdentityWcdma cellIdentity2 = ((android.telephony.CellInfoWcdma) cellInfo).getCellIdentity();
                        int i2 = android.os.Build.VERSION.SDK_INT;
                        if (i2 >= 28 && (operatorAlphaLong2 = cellIdentity2.getOperatorAlphaLong()) != null) {
                            arrayList3.add(operatorAlphaLong2.toString());
                        }
                        if (i2 >= 28) {
                            num2 = cellIdentity2.getMccString();
                        } else {
                            int mcc2 = cellIdentity2.getMcc();
                            num2 = mcc2 != Integer.MAX_VALUE ? java.lang.Integer.toString(mcc2) : null;
                        }
                        if (i2 >= 28) {
                            str = cellIdentity2.getMncString();
                        } else {
                            int mnc2 = cellIdentity2.getMnc();
                            if (mnc2 != Integer.MAX_VALUE) {
                                str = java.lang.Integer.toString(mnc2);
                            }
                        }
                        if (num2 != null && str != null) {
                            arrayList.add(num2);
                            arrayList2.add(str);
                        }
                    } else if (cellInfo instanceof android.telephony.CellInfoLte) {
                        android.telephony.CellIdentityLte cellIdentity3 = ((android.telephony.CellInfoLte) cellInfo).getCellIdentity();
                        int i3 = android.os.Build.VERSION.SDK_INT;
                        if (i3 >= 28 && (operatorAlphaLong3 = cellIdentity3.getOperatorAlphaLong()) != null) {
                            arrayList3.add(operatorAlphaLong3.toString());
                        }
                        if (i3 >= 28) {
                            num3 = cellIdentity3.getMccString();
                        } else {
                            int mcc3 = cellIdentity3.getMcc();
                            num3 = mcc3 != Integer.MAX_VALUE ? java.lang.Integer.toString(mcc3) : null;
                        }
                        if (i3 >= 28) {
                            str = cellIdentity3.getMncString();
                        } else {
                            int mnc3 = cellIdentity3.getMnc();
                            if (mnc3 != Integer.MAX_VALUE) {
                                str = java.lang.Integer.toString(mnc3);
                            }
                        }
                        if (num3 != null && str != null) {
                            arrayList.add(num3);
                            arrayList2.add(str);
                        }
                    } else if (cellInfo instanceof android.telephony.CellInfoCdma) {
                        android.telephony.CellIdentityCdma cellIdentity4 = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity();
                        if (android.os.Build.VERSION.SDK_INT >= 28 && (operatorAlphaLong4 = cellIdentity4.getOperatorAlphaLong()) != null) {
                            arrayList3.add(operatorAlphaLong4.toString());
                        }
                    } else if (android.os.Build.VERSION.SDK_INT < 29 || !(cellInfo instanceof android.telephony.CellInfoTdscdma)) {
                        java.util.Objects.toString(cellInfo);
                    } else {
                        android.telephony.CellIdentityTdscdma cellIdentity5 = ((android.telephony.CellInfoTdscdma) cellInfo).getCellIdentity();
                        java.lang.CharSequence operatorAlphaLong5 = cellIdentity5.getOperatorAlphaLong();
                        if (operatorAlphaLong5 != null) {
                            arrayList3.add(operatorAlphaLong5.toString());
                        }
                        java.lang.String mccString = cellIdentity5.getMccString();
                        java.lang.String mncString = cellIdentity5.getMncString();
                        if (mccString != null && mncString != null) {
                            arrayList.add(mccString);
                            arrayList2.add(mncString);
                        }
                    }
                }
            }
            if (arrayList3.size() == 0) {
                arrayList3.add(this.f3333a.getNetworkOperatorName());
            }
            java.lang.String[] strArr = new java.lang.String[arrayList3.size()];
            this.f = strArr;
            arrayList3.toArray(strArr);
            java.lang.String[] strArr2 = new java.lang.String[arrayList.size()];
            this.d = strArr2;
            arrayList.toArray(strArr2);
            java.lang.String[] strArr3 = new java.lang.String[arrayList2.size()];
            this.e = strArr3;
            arrayList2.toArray(strArr3);
            this.c = java.lang.Integer.valueOf(this.f3333a.getPhoneCount());
        } else {
            this.c = java.lang.Integer.valueOf(this.f3333a.getPhoneCount());
            java.lang.String networkOperatorName = this.f3333a.getNetworkOperatorName();
            if (networkOperatorName != null) {
                this.f = new java.lang.String[]{networkOperatorName};
            }
            java.lang.String networkOperator = this.f3333a.getNetworkOperator();
            if (!android.text.TextUtils.isEmpty(networkOperator)) {
                java.lang.String substring = networkOperator.substring(0, 3);
                java.lang.String substring2 = networkOperator.substring(3);
                this.d = new java.lang.String[]{substring};
                this.e = new java.lang.String[]{substring2};
            }
        }
        n2Var.a("numSims", this.c);
        n2Var.b("carrierMobileCountryCodes", this.d);
        n2Var.b("carrierMobileNetworkCodes", this.e);
        n2Var.b("carrierNames", this.f);
    }
}
