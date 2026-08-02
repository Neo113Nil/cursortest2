package com.miteksystems.misnap.workflow.fragment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\rB\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/a;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "", "date", "", "isValid", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "a", "J", "minDate", util.h.xy.cb.b.f1091, "maxDate", "<init>", "(JJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class a implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.fragment.a.Companion INSTANCE = new com.miteksystems.misnap.workflow.fragment.a.Companion(null);
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/a$a;", "Landroid/os/Parcelable$Creator;", "Lcom/miteksystems/misnap/workflow/fragment/a;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/miteksystems/misnap/workflow/fragment/a;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "(I)[Lcom/miteksystems/misnap/workflow/fragment/a;"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.miteksystems.misnap.workflow.fragment.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.miteksystems.misnap.workflow.fragment.a> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.miteksystems.misnap.workflow.fragment.a createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.miteksystems.misnap.workflow.fragment.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.miteksystems.misnap.workflow.fragment.a[] newArray(int size) {
            return new com.miteksystems.misnap.workflow.fragment.a[size];
        }

        private Companion() {
        }
    }

    private a(long j, long j2) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ a(long j) {
        this(Long.MIN_VALUE, j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(android.os.Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeLong(this.getHighSpeedVideoSizes);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean isValid(long date) {
        return date <= this.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI <= date;
    }
}
