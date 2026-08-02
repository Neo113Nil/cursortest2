package org.betup.model.remote.api.rest.user.bets.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.user.details.UserDetailsDataModel;

/* loaded from: classes2.dex */
public class BetsListModel {

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("final_coeficient")
    @Expose
    private Double finalCoeficient;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("money_placed")
    @Expose
    private long moneyPlaced;

    @SerializedName("money_returned")
    @Expose
    private long moneyReturned;

    @SerializedName("placed_bets")
    @Expose
    private List<BetsPlaceModel> placedBets = new ArrayList();

    @SerializedName("state")
    @Expose
    private BetState state;

    @SerializedName("ticket_return_amount")
    @Expose
    private int ticketReturn;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private UserDetailsDataModel user;

    public int getTicketReturn() {
        return this.ticketReturn;
    }

    public void setTicketReturn(int ticketReturn) {
        this.ticketReturn = ticketReturn;
    }

    public UserDetailsDataModel getUser() {
        return this.user;
    }

    public void setUser(UserDetailsDataModel user) {
        this.user = user;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFinalCoeficient() {
        return this.finalCoeficient;
    }

    public void setFinalCoeficient(Double finalCoeficient) {
        this.finalCoeficient = finalCoeficient;
    }

    public BetState getState() {
        return this.state;
    }

    public void setState(BetState state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<BetsPlaceModel> getPlacedBets() {
        return this.placedBets;
    }

    public void setPlacedBets(List<BetsPlaceModel> placedBets) {
        this.placedBets = placedBets;
    }

    public long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public void setMoneyPlaced(long moneyPlaced) {
        this.moneyPlaced = moneyPlaced;
    }

    public long getMoneyReturned() {
        return this.moneyReturned;
    }

    public void setMoneyReturned(long moneyReturned) {
        this.moneyReturned = moneyReturned;
    }

    public boolean isForSale() {
        return hasStartedMatches() && getState() == BetState.PENDING;
    }

    public boolean isForCancellation() {
        return !hasStartedMatches() && getState() == BetState.PENDING;
    }

    public boolean hasStartedMatches() {
        Iterator<BetsPlaceModel> it = getPlacedBets().iterator();
        while (it.hasNext()) {
            if (it.next().getSportMatch().getState() == MatchState.SCHEDULED) {
                return false;
            }
        }
        return true;
    }
}
