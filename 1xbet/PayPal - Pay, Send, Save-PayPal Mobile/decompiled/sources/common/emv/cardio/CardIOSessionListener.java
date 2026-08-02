package common.emv.cardio;

/* loaded from: classes17.dex */
public interface CardIOSessionListener {
    void onCardDetectFailed(common.emv.cardio.CardIO cardIO);

    void onCardDetected(common.emv.cardio.CardIO cardIO, common.emv.cardio.CardSession cardSession);
}
