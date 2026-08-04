package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0682b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9450a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9450a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f9330a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f9331b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f9336e = null;
                fragmentManagerState.f9337f = new ArrayList();
                fragmentManagerState.f9338x = new ArrayList();
                fragmentManagerState.f9332a = parcel.createStringArrayList();
                fragmentManagerState.f9333b = parcel.createStringArrayList();
                fragmentManagerState.f9334c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f9335d = parcel.readInt();
                fragmentManagerState.f9336e = parcel.readString();
                fragmentManagerState.f9337f = parcel.createStringArrayList();
                fragmentManagerState.f9338x = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f9339y = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f9450a) {
            case 0:
                return new BackStackRecordState[i7];
            case 1:
                return new BackStackState[i7];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i7];
            case 3:
                return new FragmentManagerState[i7];
            default:
                return new FragmentState[i7];
        }
    }
}
