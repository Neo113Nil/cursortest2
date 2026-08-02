package net.idrnd.misnap.iad;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError;", "", "CaptureCoreClosed", "DerKeyInvalid", "EncryptionError", "NotReadyForCapture", "PhotoWithPassedTimestampDoesNotExist", "UnknownError", "Lnet/idrnd/misnap/iad/CaptureError$CaptureCoreClosed;", "Lnet/idrnd/misnap/iad/CaptureError$DerKeyInvalid;", "Lnet/idrnd/misnap/iad/CaptureError$EncryptionError;", "Lnet/idrnd/misnap/iad/CaptureError$NotReadyForCapture;", "Lnet/idrnd/misnap/iad/CaptureError$PhotoWithPassedTimestampDoesNotExist;", "Lnet/idrnd/misnap/iad/CaptureError$UnknownError;"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public abstract class CaptureError {

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$CaptureCoreClosed;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class CaptureCoreClosed extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.CaptureCoreClosed INSTANCE = new net.idrnd.misnap.iad.CaptureError.CaptureCoreClosed();

        public CaptureCoreClosed() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$DerKeyInvalid;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class DerKeyInvalid extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.DerKeyInvalid INSTANCE = new net.idrnd.misnap.iad.CaptureError.DerKeyInvalid();

        public DerKeyInvalid() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$EncryptionError;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class EncryptionError extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.EncryptionError INSTANCE = new net.idrnd.misnap.iad.CaptureError.EncryptionError();

        public EncryptionError() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$NotReadyForCapture;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class NotReadyForCapture extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.NotReadyForCapture INSTANCE = new net.idrnd.misnap.iad.CaptureError.NotReadyForCapture();

        public NotReadyForCapture() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$PhotoWithPassedTimestampDoesNotExist;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class PhotoWithPassedTimestampDoesNotExist extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.PhotoWithPassedTimestampDoesNotExist INSTANCE = new net.idrnd.misnap.iad.CaptureError.PhotoWithPassedTimestampDoesNotExist();

        public PhotoWithPassedTimestampDoesNotExist() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lnet/idrnd/misnap/iad/CaptureError$UnknownError;", "Lnet/idrnd/misnap/iad/CaptureError;"}, k = 1, mv = {1, 9, 0})
    public static final class UnknownError extends net.idrnd.misnap.iad.CaptureError {
        public static final net.idrnd.misnap.iad.CaptureError.UnknownError INSTANCE = new net.idrnd.misnap.iad.CaptureError.UnknownError();

        public UnknownError() {
            super(null);
        }
    }

    public /* synthetic */ CaptureError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public CaptureError() {
    }
}
