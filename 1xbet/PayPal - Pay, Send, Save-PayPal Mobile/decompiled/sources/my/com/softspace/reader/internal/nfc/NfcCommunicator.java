package my.com.softspace.reader.internal.nfc;

/* loaded from: classes17.dex */
public interface NfcCommunicator {

    public enum ConnectStatus {
        Successful,
        GeneralFail,
        InvalidTagDetectedFail,
        DuplicateCardFail
    }

    my.com.softspace.reader.internal.nfc.NfcCommunicator.ConnectStatus connectCard(android.nfc.Tag tag);

    int getTechFlags();

    java.util.List<java.lang.String> getTechList();

    boolean isCardConnected();

    boolean removeCard(boolean z);

    byte[] sendDataToCard(byte[] bArr) throws java.io.IOException;
}
