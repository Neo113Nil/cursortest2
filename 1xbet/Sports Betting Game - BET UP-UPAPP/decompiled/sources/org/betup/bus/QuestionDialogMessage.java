package org.betup.bus;

/* loaded from: classes2.dex */
public class QuestionDialogMessage {
    private Runnable onNoClick;
    private Runnable onYesClick;
    private String question;

    public QuestionDialogMessage(String question, Runnable onYesClick, Runnable onNoClick) {
        this.question = question;
        this.onYesClick = onYesClick;
        this.onNoClick = onNoClick;
    }

    public String getQuestion() {
        return this.question;
    }

    public Runnable getOnYesClick() {
        return this.onYesClick;
    }

    public Runnable getOnNoClick() {
        return this.onNoClick;
    }
}
