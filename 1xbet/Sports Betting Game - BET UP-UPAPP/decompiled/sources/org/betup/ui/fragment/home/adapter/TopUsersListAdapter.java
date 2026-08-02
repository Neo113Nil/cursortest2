package org.betup.ui.fragment.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;
import org.betup.model.remote.entity.rank.RankUserModel;
import org.betup.ui.controls.RoiView;
import org.betup.ui.fragment.home.AdapterAppliedListener;
import org.betup.utils.PicassoHelper;

/* loaded from: classes4.dex */
public class TopUsersListAdapter extends BaseAdapter implements LinearLayoutAdapter {
    private LayoutInflater inflater;
    private Context mContext;
    private OnUserClickListener onUserClickListener;
    private List<RankUserModel> users;

    public interface OnUserClickListener {
        void onClickInUser(int id);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;

        public ViewHolder_ViewBinding(ViewHolder target, View source) {
            this.target = target;
            target.userRank = (TextView) Utils.findRequiredViewAsType(source, R.id.topUsersListRank, "field 'userRank'", TextView.class);
            target.userPhoto = (RoundedImageView) Utils.findRequiredViewAsType(source, R.id.topUsersListPhoto, "field 'userPhoto'", RoundedImageView.class);
            target.username = (TextView) Utils.findRequiredViewAsType(source, R.id.topUsersListName, "field 'username'", TextView.class);
            target.roiView = (RoiView) Utils.findRequiredViewAsType(source, R.id.roiView, "field 'roiView'", RoiView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.userRank = null;
            viewHolder.userPhoto = null;
            viewHolder.username = null;
            viewHolder.roiView = null;
        }
    }

    public TopUsersListAdapter(List<RankUserModel> passedUsers, Context context) {
        this.users = passedUsers;
        this.mContext = context;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // org.betup.ui.fragment.home.adapter.LinearLayoutAdapter
    public void apply(final LinearLayout layout, final AdapterAppliedListener listener) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.users.size(); i++) {
            View inflate = this.inflater.inflate(R.layout.item_top_users_list, (ViewGroup) null, false);
            new ViewHolder(inflate);
            arrayList.add(inflate);
        }
        layout.removeAllViews();
        for (int i2 = 0; i2 < this.users.size(); i2++) {
            layout.addView(getView(i2, (View) arrayList.get(i2), layout));
        }
        listener.applied();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.users.size();
    }

    @Override // android.widget.Adapter
    public RankUserModel getItem(int position) {
        return this.users.get(position);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.inflater.inflate(R.layout.item_top_users_list, parent, false);
        }
        ViewHolder viewHolder = new ViewHolder(convertView);
        final RankUserModel rankUserModel = this.users.get(position);
        viewHolder.userRank.setText(String.valueOf(rankUserModel.getRank()));
        PicassoHelper.with(this.mContext).setImageView(viewHolder.userPhoto).setImageUrl(rankUserModel.getPhotoUrl()).placeholder(R.drawable.user_round_avatar).load();
        viewHolder.username.setText(rankUserModel.getName());
        viewHolder.roiView.setValue(rankUserModel.getRoi(), rankUserModel.getChange());
        convertView.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.home.adapter.TopUsersListAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopUsersListAdapter.this.m13747xe24419da(rankUserModel, view);
            }
        });
        return convertView;
    }

    /* renamed from: lambda$getView$0$org-betup-ui-fragment-home-adapter-TopUsersListAdapter, reason: not valid java name */
    /* synthetic */ void m13747xe24419da(RankUserModel rankUserModel, View view) {
        this.onUserClickListener.onClickInUser(rankUserModel.getId());
    }

    class ViewHolder {

        @BindView(R.id.roiView)
        RoiView roiView;

        @BindView(R.id.topUsersListPhoto)
        RoundedImageView userPhoto;

        @BindView(R.id.topUsersListRank)
        TextView userRank;

        @BindView(R.id.topUsersListName)
        TextView username;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    public TopUsersListAdapter setOnUserClickListener(OnUserClickListener onUserClickListener) {
        this.onUserClickListener = onUserClickListener;
        return this;
    }
}
