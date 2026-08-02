package org.betup.bus;

/* loaded from: classes2.dex */
public class BetSelectedFromSectionMessage {
    private int sectionId;

    public BetSelectedFromSectionMessage(int sectionId) {
        this.sectionId = sectionId;
    }

    public int getSectionId() {
        return this.sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
}
