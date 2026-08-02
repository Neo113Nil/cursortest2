package androidx.customview.view;

import Z.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f9102a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbsSavedState f9101b = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f9102a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f9102a, i7);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9102a = parcelable == f9101b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f9102a = readParcelable == null ? f9101b : readParcelable;
    }
}
